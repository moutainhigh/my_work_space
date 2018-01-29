package com.ooteco.paginator.dialect;

import com.ooteco.paginator.PageBounds;
import org.apache.ibatis.mapping.MappedStatement;

public class MySQLDialect extends Dialect  {

    public MySQLDialect(MappedStatement mappedStatement, Object parameterObject, PageBounds pageBounds) {
        super(mappedStatement, parameterObject, pageBounds);
    }

    /**
     * 构建SQL
     *
     * @param sql        原SQL
     * @param offsetName 偏移量名称
     * @param offset     偏移量
     * @param limitName  条数名称
     * @param limit      每页条数
     * @return 加了分页的SQL
     */
    protected String getLimitString(String sql, String offsetName, int offset, String limitName, int limit) {
        StringBuffer buffer = new StringBuffer(sql.length() + 20).append(sql);
        if (offset > 0) {
            buffer.append(" limit ?, ?");
            setPageParameter(offsetName, offset, Integer.class);
            setPageParameter(limitName, limit, Integer.class);
        } else {
            buffer.append(" limit ?");
            setPageParameter(limitName, limit, Integer.class);
        }
        return buffer.toString();
    }
}
