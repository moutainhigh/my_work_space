package com.ooteco.exp;

import com.alibaba.fastjson.JSONObject;
import com.ooteco.common.ResponseEntity;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomExceptionHandler implements HandlerExceptionResolver {

    private static Logger log = Logger.getLogger(CustomExceptionHandler.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace();
        String json = JSONObject.toJSONString(ResponseEntity.error("系统异常，请稍后重试！"));
        httpServletResponse.setCharacterEncoding("UTF-8");
//        httpServletResponse.setContentType("application/json; charset=utf-8");
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = null;
        try {
            writer = httpServletResponse.getWriter();
            writer.write(json);
            writer.flush();
            return null;
        } catch (IOException e1) {
            log.error("", e1);
        }finally {
            if(writer != null)
                writer.close();
        }
        return null;
    }
}
