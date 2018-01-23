/*
 * copy right decl.
 */
package com.match.controller.base;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.match.controller.OutErrorController;
import com.match.utils.DESEncryption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;



/**
 * 页面异常处理
 * @author waii
 * @since 2018-01-16
 */
public class ExceptionResolver  extends SimpleMappingExceptionResolver {

    @Resource
    protected OutErrorController outErrorController;

    protected final Logger LOG = LoggerFactory.getLogger(ExceptionResolver.class);

    protected ModelAndView getModelAndView(String viewName, Exception ex, HttpServletRequest request) {
        Map<String, Object> data = Maps.newHashMap();
        if (request.getRequestURI().endsWith(".json") || request.getHeader("accept").indexOf("application/json") >= 0) {
            data.put("result", ex.getMessage());
        } else {
        	try {
				DESEncryption des = new DESEncryption();
				StringWriter errors = new StringWriter();
				ex.printStackTrace(new PrintWriter(errors));
				data.put(
						"exceptionDetail",
						des.encrypt(ex.getClass().getName() + ":"
								+ ex.getMessage() + "\n" + errors.toString()));
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
        StringBuffer detail = new StringBuffer();

        detail.append("请求[").append(request.getRequestURI()).append("]发生异常.");
        StringBuffer reqData = new StringBuffer();
        try {
            Boolean resource = (Boolean)request.getAttribute("RESOURCE_REQUEST");
            if(resource == null || !resource) {
                StringWriter sw = new StringWriter();
                ex.printStackTrace(new PrintWriter(sw));
                reqData.append("请求数据：").append(JSON.toJSONString(request.getParameterMap())).append("\n");
            }
        } catch (Exception e) {
        }
        LOG.error(detail.append("\n").append(reqData).toString(), ex);// 记录错误日志
        return outErrorController.error(data);
    }
    
}
