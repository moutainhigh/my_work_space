package com.ooteco.paginator;

import com.ooteco.paginator.dialect.Dialect;
import com.ooteco.paginator.dialect.MySQLDialect;
import com.ooteco.paginator.support.SQLHelp;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.MappedStatement.Builder;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@Intercepts({@Signature(
        type = Executor.class,
        method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})})
public class OffsetLimitInterceptor implements Interceptor {
    private static final Logger logger = LoggerFactory.getLogger(OffsetLimitInterceptor.class);

    private static final int MAPPED_STATEMENT_INDEX = 0;
    private static final int PARAMETER_INDEX = 1;
    private static final int ROW_BOUNDS_INDEX = 2;

    /**
     * 拦截器
     *
     * @param invocation 执行
     * @return 返回
     * @throws Throwable 异常信息
     */
    @Override
    public Object intercept(final Invocation invocation) throws Throwable {
        final Object[] queryArgs = invocation.getArgs();
        final RowBounds rowBounds = (RowBounds) queryArgs[ROW_BOUNDS_INDEX];
        final PageBounds pageBounds = new PageBounds(rowBounds);

        if (pageBounds.getOffset() == RowBounds.NO_ROW_OFFSET && pageBounds.getLimit() == RowBounds.NO_ROW_LIMIT) {
            return invocation.proceed();
        }

        final Executor executor = (Executor) invocation.getTarget();
        final MappedStatement ms = (MappedStatement) queryArgs[MAPPED_STATEMENT_INDEX];
        final Object parameter = queryArgs[PARAMETER_INDEX];
        Dialect dialect = new MySQLDialect(ms, parameter, pageBounds);
        final BoundSql boundSql = ms.getBoundSql(parameter);

        queryArgs[MAPPED_STATEMENT_INDEX] = copyFromNewSql(ms, boundSql, dialect.getPageSQL(),
                dialect.getParameterMappings(), dialect.getParameterObject());
        queryArgs[PARAMETER_INDEX] = dialect.getParameterObject();
        queryArgs[ROW_BOUNDS_INDEX] = new RowBounds(RowBounds.NO_ROW_OFFSET, RowBounds.NO_ROW_LIMIT);

        Integer count = SQLHelp.getCount(ms, executor.getTransaction(), parameter, boundSql, dialect);
        Page page = new Page(pageBounds.getPage(), pageBounds.getLimit(), count);

        List list = new ArrayList(0);
        if (count != 0) {
            // 如果查询的页码已经超过最后一页啦，则将页码改为最后一页
            if ((count + pageBounds.getLimit() - 1) / pageBounds.getLimit() < pageBounds.getPage()) {
                pageBounds.setPage((count + pageBounds.getLimit() - 1) / pageBounds.getLimit());
                dialect = new MySQLDialect(ms, parameter, pageBounds);
                queryArgs[MAPPED_STATEMENT_INDEX] = copyFromNewSql(ms, boundSql, dialect.getPageSQL(),
                        dialect.getParameterMappings(), dialect.getParameterObject());
                queryArgs[PARAMETER_INDEX] = dialect.getParameterObject();
            }

            list = (List) invocation.proceed();
        }

        return new PageList(list, page);
    }

    private <T> Future<T> call(Callable callable) {
        FutureTask<T> future = new FutureTask(callable);
        future.run();
        return future;
    }

    private MappedStatement copyFromNewSql(MappedStatement ms, BoundSql boundSql, String sql,
                                           List<ParameterMapping> parameterMappings, Object parameter) {
        BoundSql newBoundSql = copyFromBoundSql(ms, boundSql, sql, parameterMappings, parameter);
        return copyFromMappedStatement(ms, new BoundSqlSqlSource(newBoundSql));
    }

    private BoundSql copyFromBoundSql(MappedStatement ms, BoundSql boundSql, String sql,
                                      List<ParameterMapping> parameterMappings, Object parameter) {
        BoundSql newBoundSql = new BoundSql(ms.getConfiguration(), sql, parameterMappings, parameter);
        for (ParameterMapping mapping : boundSql.getParameterMappings()) {
            String prop = mapping.getProperty();
            if (boundSql.hasAdditionalParameter(prop)) {
                newBoundSql.setAdditionalParameter(prop, boundSql.getAdditionalParameter(prop));
            }
        }
        return newBoundSql;
    }

    private MappedStatement copyFromMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
        Builder builder = new Builder(ms.getConfiguration(), ms.getId(), newSqlSource, ms.getSqlCommandType());

        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        if (ms.getKeyProperties() != null && ms.getKeyProperties().length != 0) {
            StringBuilder keyProperties = new StringBuilder();
            for (String keyProperty : ms.getKeyProperties()) {
                keyProperties.append(keyProperty).append(",");
            }
            keyProperties.delete(keyProperties.length() - 1, keyProperties.length());
            builder.keyProperty(keyProperties.toString());
        }

        builder.timeout(ms.getTimeout());

        builder.parameterMap(ms.getParameterMap());

        builder.resultMaps(ms.getResultMaps());
        builder.resultSetType(ms.getResultSetType());

        builder.cache(ms.getCache());
        builder.flushCacheRequired(ms.isFlushCacheRequired());
        builder.useCache(ms.isUseCache());

        return builder.build();
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    public static class BoundSqlSqlSource implements SqlSource {
        BoundSql boundSql;

        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }

        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }
}


