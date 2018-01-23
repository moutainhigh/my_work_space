package com.match.controller.base;

import com.match.utils.common.Message;
import com.match.utils.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by waii on 2017/4/9.
 */
public class ExceptionResolver extends SimpleMappingExceptionResolver {
    protected final Logger LOG = LoggerFactory.getLogger(ExceptionResolver.class);


    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response,
                                              Object handler, Exception ex) {
        try {
            response.setCharacterEncoding("utf8");
            response.setContentType("application/json;charset=utf-8");
            PrintWriter out = new PrintWriter(response.getOutputStream());
            if (ex instanceof ServiceException) {
                ServiceException se = (ServiceException) ex;
                out.println("{");
                out.println("\"code\": \""    + se.getCode() +    "\",");
                out.println("\"result\": \"" + se.getMessage() + "\",");
                out.println("\"data\": null");
                out.println("}");
                out.flush();
                out.close();
                return null;
            } else {
                out.println("{");
                out.println("\"code\": \""    + Message.FAILED  + "\",");
                out.println("\"result\": \"" + ex.getMessage() + "\",");
                out.println("\"data\": null");
                out.println("}");
                out.flush();
                out.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
