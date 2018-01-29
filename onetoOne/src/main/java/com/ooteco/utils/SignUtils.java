package com.ooteco.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.ooteco.entity.req.BaseReq;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.lang.StringUtils;

import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zk on 2017/8/28.
 */
public class SignUtils {

    private static String secretKey = "key";

//    private static String byteArrayToHexString(byte b[]) {
//        StringBuffer resultSb = new StringBuffer();
//        for (int i = 0; i < b.length; i++)
//            resultSb.append(byteToHexString(b[i]));
//
//        return resultSb.toString();
//    }
//
//    private static String byteToHexString(byte b) {
//        int n = b;
//        if (n < 0)
//            n += 256;
//        int d1 = n / 16;
//        int d2 = n % 16;
//        return hexDigits[d1] + hexDigits[d2];
//    }
//
//    public static String MD5Encode(String origin, String charsetname) {
//        String resultString = null;
//        try {
//            resultString = new String(origin);
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            if (charsetname == null || "".equals(charsetname))
//                resultString = byteArrayToHexString(md.digest(resultString
//                        .getBytes()));
//            else
//                resultString = byteArrayToHexString(md.digest(resultString
//                        .getBytes(charsetname)));
//        } catch (Exception exception) {
//        }
//        return resultString;
//    }
//
//    private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",
//            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
//
//    @SuppressWarnings("unchecked")
//    public static String createSign(String characterEncoding,SortedMap<Object,Object> parameters){
//        StringBuffer sb = new StringBuffer();
//        Set es = parameters.entrySet();//所有参与传参的参数按照accsii排序（升序）
//        Iterator it = es.iterator();
//        while(it.hasNext()) {
//            Map.Entry entry = (Map.Entry)it.next();
//            String k = (String)entry.getKey();
//            Object v = entry.getValue();
//            if(null != v && !"".equals(v)
//                    && !"sign".equals(k) && !"key".equals(k)) {
//                sb.append(k + "=" + v + "&");
//            }
//        }
//        sb.append("key=" + SecretKey.SECRETKEY);
//        String sign = MD5Encode(sb.toString(), characterEncoding).toUpperCase();
//        return sign;
//    }
//
//    public static boolean toSign(Map<String,Object> dataMap){
////        SignUtils.toSign(SignUtils.beanToMap(loanVO));
//        SortedMap<Object,Object> parameters = new TreeMap<Object,Object>();
//        for (String key : dataMap.keySet()) {
//            parameters.put(key,dataMap.get(key));
//         }
//        String characterEncoding = "UTF-8";
//        String mySign = createSign(characterEncoding,parameters);
//        if(dataMap.get("sign").equals(mySign))
//            return true;
//            return false;
//    }
//
    public static boolean isSignMatched(BaseReq request){
        return request.getSign().equals(getRequestSign(request));
    }

    public static Map<String, Object> beanToMap(Object obj) {
        Map<String, Object> params = new HashMap<String, Object>(0);
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!"class".equals(name)) {
                    params.put(name, propertyUtilsBean.getNestedProperty(obj, name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return params;
    }

    public static String getRequestSign(Object request){
        return getSign(getRequestMap(request));
    }

    private static Map<String, String> getRequestMap(Object request) {
        Map<String, String> map = new HashMap<String, String>();
        Field[] fields = getRequestFields(request.getClass(), new Field[]{});
        for (Field field : fields) {
            try {
                field.setAccessible(true);// 设置可以访问私有成员变量值
                Object o = field.get(request);
                if (null != o && StringUtils.isNotBlank(o.toString()) && !field.getName().equals("sign") && !field.getName().equals("serialVersionUID")) {
                    map.put(field.getName(), o.toString());
                }
            }
            catch (Exception e) {
            }
        }
        return map;
    }

    private static Field[] getRequestFields(Class  cls, Field[] fields){
        fields = addFields(cls.getDeclaredFields(), fields);
        if(cls.getSuperclass() != null){
            cls = cls.getSuperclass();
            fields = getRequestFields(cls, fields);
        }
        return fields;
    }

    private static Field[] addFields(Field[] source, Field[] target){
        Field[] fields = new Field[source.length + target.length];
        int i=0;
        for(;i<source.length;i++){
            fields[i] = source[i];
        }
        for(int j=0;j<target.length;j++){
            fields[i+j] = target[j];
        }
        return fields;
    }

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

    public static String getSign(Map<String, String> paramsMap) {
        return getSign(paramsMap, SignUtils.secretKey);
    }

    public static Map<String,String> convertJsonObjectToMap(JSONObject jsonObject){
        Map<String,String> param = new HashMap<>();
        for(Map.Entry<String, Object> entry : jsonObject.entrySet()){
            if(StringUtils.isNotBlank(entry.getValue().toString())){
                if(entry.getKey().equals("list")){
                    JSONArray jsonArray = (JSONArray) entry.getValue();
                    List<Map<String,String>> mapList = new ArrayList<>();
                    for(Object obj : jsonArray){
                        JSONObject json = (JSONObject) obj;
                        String[] keys = json.keySet().toArray(new String[json.size()]);
                        Map<String,String> map = new LinkedHashMap<>();
                        Arrays.sort(keys);
                        for(String key : keys){
                            map.put(key, json.getString(key));
                        }
                        mapList.add(map);
                    }
                    param.put(entry.getKey(), JSON.toJSONString(mapList));
                }else{
                    param.put(entry.getKey(),entry.getValue().toString());
                }
            }
        }
        return param;
    }

    public static String getSign(JSONObject jsonObject){
        return getSign(convertJsonObjectToMap(jsonObject));
    }

    public static Map<String, String> getParam(Object req){
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(req));
        return convertJsonObjectToMap(jsonObject);
    }

    /**
     * 通过参数生成签名信息
     *
     * @param paramsMap
     * @return
     */
    public static String getSign(Map<String, String> paramsMap, String secretKey) {
        if (StringUtils.isBlank(secretKey)) {
            throw new RuntimeException("密钥不能为空");
        }
        String[] keys = paramsMap.keySet().toArray(new String[paramsMap.size()]);
        Arrays.sort(keys);

        StringBuffer sb = new StringBuffer();
        for (String key : keys) {
            sb.append(key);
            sb.append(paramsMap.get(key));
        }

        sb.append(secretKey);

        String md5 = MD5HexString(sb.toString());

        return md5;
    }

//    public static void main(String[] args) {
//        //微信api提供的参数
//        String appid = "wxd930ea5d5a258f4f";
//        String mch_id = "10000100";
//        String timeStamp = System.currentTimeMillis()/1000 + "";
//
//        SortedMap<Object,Object> parameters = new TreeMap<Object,Object>();
//        parameters.put("appid", appid);
//        parameters.put("mch_id", mch_id);
//        parameters.put("timeStamp", timeStamp);
//
//        String characterEncoding = "UTF-8";
//        String mySign = createSign(characterEncoding,parameters);
//        System.out.println("我的签名是："+mySign);
//        System.out.println("我的签名是："+createSign(characterEncoding,parameters));
//    }

    public static void main(String[] args) {
        String str = "list[{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"2.330000\",\"matchCode\":\"1\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"2.330000\",\"matchCode\":\"2\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"2.330000\",\"matchCode\":\"3\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"2.330000\",\"matchCode\":\"4\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"2.330000\",\"matchCode\":\"5\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"2.330000\",\"matchCode\":\"6\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"7\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"8\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"9\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"10\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"11\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"12\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"13\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"14\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"15\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"16\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"34.610000\",\"matchCode\":\"17\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"},{\"endDate\":\"20171002\",\"financeCode\":\"201709011019\",\"financeProductsId\":\"28786\",\"loanCode\":\"2368\",\"loanMoney\":\"7.640000\",\"matchCode\":\"18\",\"matchTime\":\"20170914160449\",\"startDate\":\"20170901\",\"userCode\":\"abc\"}]loanCode2368soldOutTime20170914164912timeStamp20170914165212key";
        System.out.println(MD5HexString(str));
    }
}
