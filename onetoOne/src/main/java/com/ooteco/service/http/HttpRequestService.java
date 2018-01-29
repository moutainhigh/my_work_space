package com.ooteco.service.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ooteco.entity.loan.model.resp.LoanFullScaleDetail;
import com.ooteco.entity.loan.model.resp.LoanFullScaleResp;
import com.ooteco.utils.SignUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class HttpRequestService {

    public static String sendGetRequest(String url, Map<String,String> param){
        addSpecifiedParams(param);
        url += "?";
        for(Map.Entry<String,String> entry: param.entrySet()){
            url += entry.getKey() + "=" +entry.getValue() + "&";
        }
        url = url.substring(0,url.length()-1);
        return sendGetRequest(url);
    }

    public static String sendGetRequest(String url){
        HttpGet request = new HttpGet(url);
        return getRequestSuccessResult(request);
    }

    public static String sendPostRequest(String url, Map<String,String> param){
        addSpecifiedParams(param);
        HttpPost request = new HttpPost(url);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        for (Map.Entry<String, String> entry : param.entrySet()) {
            nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        try {
            request.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }finally {
            request.releaseConnection();
        }
        return getRequestSuccessResult(request);
    }

    public static String sendPostRequestWithObject(String url, Object req){
        Map<String, String> param = SignUtils.getParam(req);
        return sendPostRequest(url, param);
    }

    public static String sendPostRequest(String url, Object req){
        HttpPost request = new HttpPost(url);
        JSONObject jsonObject = getRequestJsonObject(req);
        try {
            StringEntity stringEntity = new StringEntity(jsonObject.toString());
            stringEntity.setContentEncoding("UTF-8");
            stringEntity.setContentType("application/json");//发送json数据需要设置contentType
            request.setEntity(stringEntity);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }finally {
            request.releaseConnection();
        }
        return getRequestSuccessResult(request);
    }

    private static JSONObject getRequestJsonObject(Object req){
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(req));
        addSpecifiedParams(jsonObject);
        return jsonObject;
    }

    private static String getRequestSuccessResult(HttpRequestBase request){
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        try {
            httpClient = HttpClients.createDefault();
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(60000).setConnectTimeout(60000).build();
            request.setConfig(requestConfig);
            response = httpClient.execute(request);
            if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                HttpEntity entity = response.getEntity();
                return EntityUtils.toString(entity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
                request.releaseConnection();
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void addSpecifiedParams(Map<String, String> param){
        param.put("timeStamp", getTimeStamp());
        param.put("sign", SignUtils.getSign(param));
    }

    public static void addSpecifiedParams(JSONObject jsonObject){
        jsonObject.put("timeStamp", getTimeStamp());
        jsonObject.put("sign", SignUtils.getSign(jsonObject));
    }

    private static String getTimeStamp(){
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHssmm");
        return dateFormat.format(new Date());
    }

    public static void main(String[] args) {
        LoanFullScaleResp resp = new LoanFullScaleResp("5245", null);
        resp.soldOutTime = "20170125000000";
        List<LoanFullScaleDetail> list = new ArrayList<>();
        LoanFullScaleDetail detail = new LoanFullScaleDetail();
        detail.loanMoney = new BigDecimal(34600);
        detail.financeCode = "115";
        list.add(detail);
        resp.list = list;
        JSONObject jsonObject = getRequestJsonObject(resp);
        System.out.println(jsonObject.toJSONString());
    }
}
