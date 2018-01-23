package com.match.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求处理工具类
 * 
 * @author GaoXiang Date: 2015-3-7
 */
public class RequestUtil {
    
    private static RequestUtil instance = new RequestUtil();
    
    private RequestUtil() {
    }
    
    public static RequestUtil getInstance() {
        return instance;
    }
    
    /**
     * 获得String类型请求参数
     * 
     * @param request
     * @param name
     * @return
     */
    public String getStringValue(HttpServletRequest request, String name) {
        return StringUtil.isEmpty(name) ? null : request.getParameter(name);
    }

    /**
     * 获得Integer类型请求参数
     *
     * @param request
     * @param name
     * @return
     */
    public int getIntValue(HttpServletRequest request, String name) {
        return StringUtil.parseInt(getStringValue(request, name));
    }

    /**
     * 获得Double类型请求参数
     *
     * @param request
     * @param name
     * @return
     */
    public double getDoubleValue(HttpServletRequest request, String name) {
        return StringUtil.parseDouble(getStringValue(request, name));
    }
    
    /**
     * 获得Boolean类型请求参数
     * 
     * @param request
     * @param name
     * @return
     */
    public boolean getBooleanValue(HttpServletRequest request, String name) {
        boolean rs = false;
        String value = getStringValue(request, name);
        if (StringUtil.isNotEmpty(value)) {
            try {
                rs = Boolean.getBoolean(value);
            }
            catch (Exception e) {
            }
            
        }
        
        return rs;
    }
    
    /**
     * 向客户端写数据
     * 
     * @param response
     * @param info
     */
    public void writeInfo(HttpServletResponse response, String info) {
        try {
            response.setContentType("text/html;charset=UTF-8");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.getWriter().write(info);
            response.getWriter().flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
