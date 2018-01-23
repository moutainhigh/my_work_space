package com.match.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;

/**
 * 加解密类
 * 
 * @author gaoxiang 2013-7-22
 */
public class EncryptUtil {
    
    /**
     * MD5加密
     * 
     * @param str
     * @return
     */
    public static String MD5HexString(String str) {
        return MD5.md5(str);
    }
    
    /**
     * URL加密
     * 
     * @param s
     * @return
     */
    public static String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            return s;
        }
    }
    
    /**
     * URL解密
     * 
     * @param s
     * @return
     */
    public static String urlDecode(String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            return s;
        }
    }
    
    /**
     * MD5加密类
     * 
     * @author gaoxiang 2012-11-8
     */
    private static class MD5 {
        
        private static char md5Chars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        
        public static String md5(String str) {
            MessageDigest md5 = getMD5Instance();
            try {
                md5.update(str.getBytes("utf-8"));
            }
            catch (UnsupportedEncodingException e) {
            }
            byte[] digest = md5.digest();
            char[] chars = toHexChars(digest);
            return new String(chars);
        }
        
        private static MessageDigest getMD5Instance() {
            try {
                return MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException ignored) {
                throw new RuntimeException(ignored);
            }
        }
        
        private static char[] toHexChars(byte[] digest) {
            char[] chars = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                char c0 = md5Chars[(b & 0xf0) >> 4];
                chars[i++] = c0;
                char c1 = md5Chars[b & 0xf];
                chars[i++] = c1;
            }
            return chars;
        }
    }
    
    /**
     * 通过参数生成签名信息
     * 
     * @param paramsMap
     * @return
     */
    public static String getSign(Map<String, String> paramsMap, String secretKey) {
        if (StringUtil.isEmpty(secretKey)) {
            throw new RuntimeException("密钥不能为空");
        }
        String[] keys = paramsMap.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        
        StringBuffer sb = new StringBuffer();
        for (String key : keys) {
            sb.append(key);
            sb.append(paramsMap.get(key));
        }
        
        sb.append(secretKey);
        
        return MD5HexString(sb.toString());
    }
    
}