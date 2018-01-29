package com.ooteco.controllers;

import com.ooteco.utils.SignUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class BaseController {

    protected Map<String,String> getRequestParams(HttpServletRequest request){
        Map<String, String> params = new HashMap<>();
        Enumeration enum_term = request.getParameterNames();
        while (enum_term.hasMoreElements()) {
            String paramName = (String) enum_term.nextElement();
            String paramValue = request.getParameter(paramName);
            if(StringUtils.isNotBlank(paramValue)){
                params.put(paramName, paramValue);
            }
        }
        return params;
    }

    protected boolean isSignMatched(HttpServletRequest request){
        Map<String,String> params = getRequestParams(request);
        String sign = params.get("sign");
        params.remove("sign");
        System.out.println(SignUtils.getSign(params));
        return SignUtils.getSign(params).equals(sign);
    }

    protected String getRequestSign(HttpServletRequest request){
        Map<String,String> params = getRequestParams(request);
        params.remove("sign");
        return SignUtils.getSign(params);
    }

    public static void main(String[] args) {
        Map<String,String> params = new HashedMap();
        params.put("N.A","");
        SignUtils.getSign(params);
    }
}
