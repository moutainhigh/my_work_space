package com.match.interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆拦截器
 * 
 * @author GaoXiang Date: 2015-5-6
 */
public class ApiInterceptor extends HandlerInterceptorAdapter {
    
    private String loginUrl;
    
    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Boolean loginStatus = (Boolean) request.getAttribute(LOGIN_STATUS);
//        if (loginStatus == null || false == loginStatus) {
//            String requestType = request.getHeader("X-Requested-With");
//            if ("XMLHttpRequest".equalsIgnoreCase(requestType)) {
//                // ajax请求
//                Map<String, Object> result = new HashMap<String, Object>();
//                result.put("status", "ERROR");
//                result.put("data", "请先登录");
//                String returnPath = request.getParameter("returnPath");
//                if (WxStringUtil.isEmpty(returnPath)) {
//                    returnPath = "/index.html";
//                }
//                result.put("url", "/login.do?returnPath=" + WxEncryptUtil.urlEncode(returnPath));
//                WxResponseUtil.responseJson(response, result);
//                return false;
//            }
//
//            String requestUrl = request.getRequestURL().toString();
//
//            String queryString = request.getQueryString();
//            if (WxStringUtil.isNotEmpty(queryString)) {
//                requestUrl += "?" + queryString;
//            }
//            String currentPath = WxEncryptUtil.urlEncode(requestUrl);
//
//            response.sendRedirect(loginUrl + currentPath);
//            return false;
//        }
//
        // 登录用户
        return super.preHandle(request, response, handler);
    }
}
