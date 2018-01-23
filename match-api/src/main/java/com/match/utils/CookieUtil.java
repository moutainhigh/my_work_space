package com.match.utils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Cookie工具类，提供cookie的添加，删除和查询
 * 
 * @author GaoXiang Date: 2015-4-4
 */
public class CookieUtil {
    
    private static CookieUtil instance = new CookieUtil();
    
    private CookieUtil() {
    }
    
    public static CookieUtil getInstance() {
        return instance;
    }
    
    /**
     * 添加cookie到指定路径，设置生存时间
     * 
     * @param name
     * @param value
     * @param days
     * @param path
     * @param domain
     * @param response
     */
    public void addCookie(String name, String value, int days, String path, String domain, HttpServletResponse response) {
        try {
            String valAscii = URLEncoder.encode(value, "utf-8");
            Cookie cookie = new Cookie(name, valAscii);
            cookie.setMaxAge(days * 24 * 60 * 60);
            if (path != null) {
                cookie.setPath(path);
            }
            
            if (domain != null) {
                cookie.setDomain(domain);
            }
            
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 获取指定名称的Cookie值
     * 
     * @param name
     * @param request
     * @return
     */
    public String getValue(String name, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return null;
        }
        
        String value = null;
        for (Cookie c : cookies) {
            if (c.getName().equals(name)) {
                try {
                    value = URLDecoder.decode(c.getValue(), "utf-8");
                    break;
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return value;
    }
    
    /**
     * 删除指定路径下的指定名字的Cookie
     * 
     * @param name cookie名称
     * @param path cookie路径
     * @param domain 域
     * @param response
     */
    public void removeCookie(String name, String path, String domain, HttpServletResponse response) {
        Cookie c = new Cookie(name, "");
        c.setMaxAge(0);
        
        if (path != null) {
            c.setPath(path);
        }
        
        if (domain != null) {
            c.setDomain(domain);
        }
        
        response.addCookie(c);
    }
    
    /**
     * 删除当前路径下的指定名字的Cookie
     * 
     * @param name cookie名称
     * @param response
     */
    public void removeCookie(String name, HttpServletResponse response) {
        removeCookie(name, null, null, response);
    }
    
    /**
     * 写cookie
     * 
     * @param response
     * @param name
     * @param value
     * @param days
     * @throws ServletException
     * @throws IOException
     */
    public void writeCookie(HttpServletResponse response, String name, String value, int days) {
        writeCookie(response, "jhjhome.com", name, value, days);
    }
    
    /**
     * 写cookie
     * 
     * @param response
     * @param domain
     * @param name
     * @param value
     * @param days
     * @throws ServletException
     * @throws IOException
     */
    public void writeCookie(HttpServletResponse response, String domain, String name, String value, int seconds) {
        value = EncryptUtil.urlEncode(value);
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(seconds);
        cookie.setPath("/");
        cookie.setDomain(domain);
        response.addCookie(cookie);
    }
    
    /**
     * 清空Cookie
     * 
     * @param request
     * @param response
     * @param domain
     */
    public void clearCookie(HttpServletRequest request, HttpServletResponse response, String domain) {
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            cookie.setValue("");
            cookie.setMaxAge(0);
            cookie.setPath("/");
            cookie.setDomain(domain);
            response.addCookie(cookie);
        }
    }
    
    /**
     * 删除指定的cookie
     * 
     * @param request
     * @param response
     * @param domain
     * @param cookieKey
     */
    public void deleteCookie(HttpServletRequest request, HttpServletResponse response, String domain, String cookieKey) {
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            if (cookieKey.equalsIgnoreCase(cookie.getName())) {
                cookie.setValue("");
                cookie.setPath("/");
                cookie.setMaxAge(0);
                cookie.setDomain(domain);
                response.addCookie(cookie);
            }
        }
    }
    
    /**
     * 根据名字获取cookie
     * 
     * @param request
     * @param name
     * @return
     */
    public Cookie getCookieByName(HttpServletRequest request, String name) {
        Map<String, Cookie> cookieMap = ReadCookieMap(request);
        if (cookieMap.containsKey(name)) {
            Cookie cookie = (Cookie) cookieMap.get(name);
            return cookie;
        } else {
            return null;
        }
    }
    
    /**
     * 根据名字获取值
     * 
     * @param request
     * @param name
     * @return
     */
    public String getCookieValueByName(HttpServletRequest request, String name) {
        Cookie cookie = getCookieByName(request, name);
        if (cookie == null) {
            return "";
        }
        return EncryptUtil.urlDecode(cookie.getValue());
    }
    
    /**
     * 将cookie封装到Map里面
     * 
     * @param request
     * @return
     */
    private static Map<String, Cookie> ReadCookieMap(HttpServletRequest request) {
        Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }
    
    /**
     * 生成签名
     * 
     * @param paramsMap
     * @return
     */
    public String getSign(Map<String, String> paramsMap, String secretKey) {
        Set<String> keySet = paramsMap.keySet();
        String[] keys = keySet.toArray(new String[keySet.size()]);
        
        Arrays.sort(keys);
        
        StringBuffer sb = new StringBuffer();
        for (String key : keys) {
            sb.append(key);
            sb.append(paramsMap.get(key));
        }
        sb.append(secretKey);
        return EncryptUtil.MD5HexString(sb.toString());
    }
}
