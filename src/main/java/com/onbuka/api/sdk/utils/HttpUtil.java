package com.onbuka.api.sdk.utils;


import com.onbuka.api.sdk.enums.SdkCodeEnums;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.resp.Resp;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author rch
 * @createTime 2023/3/06 10:47:13
 * @version 1.0
 * @description HttpUtil
 */

public class HttpUtil {
    private String key;
    private String secret;
    private String baseUrl;


    /**
     * @author ruanchuanhui
     * @createTime 2023/3/10
     * @description HttpUtil init
     * @param: apiData
     * @return: HttpUtil
     */
    public HttpUtil(ApiData apiData){
        this.key = apiData.getKey();
        this.secret = apiData.getSecret();
        this.baseUrl = apiData.getBaseUrl();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * @author ruanchuanhui
     * @createTime 2023/3/10
     * @description doPost
     * @param: httpUrl
     * @param: param
     * @return: java.lang.String
     */
    public  String doPost(String httpUrl,  String param) {
        return execute(httpUrl, param,"POST");
    }


    /**
     * @author ruanchuanhui
     * @createTime 2023/3/10
     * @description doPut
     * @param: httpUrl
     * @param: param
     * @return: java.lang.String
     */
    public  String doPut(String httpUrl,  String param) {
        return execute(httpUrl, param,"PUT");
    }



    /**
     * @author ruanchuanhui
     * @createTime 2023/3/10
     * @description doGet
     * @param: httpUrl
     * @return: java.lang.String
     */
    public  String doGet(String httpUrl){
        return execute(httpUrl, null,"GET");

//        //链接
//        HttpURLConnection connection = null;
//        InputStream is = null;
//        BufferedReader br = null;
//        StringBuffer result = new StringBuffer();
//        try {
//            //创建连接
//            URL url = new URL(httpUrl);
//            connection = (HttpURLConnection) url.openConnection();
//            //设置请求方式
//            connection.setRequestMethod("GET");
//            //设置连接超时时间
//            connection.setReadTimeout(15000);
//            //设置通用的请求属性
//            buildConnetHeader(connection);
//            //开始连接
//            connection.connect();
//            //获取响应数据
//            if (connection.getResponseCode() == 200) {
//                //获取返回的数据
//                is = connection.getInputStream();
//                if (null != is) {
//                    br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
//                    String temp = null;
//                    while (null != (temp = br.readLine())) {
//                        result.append(temp);
//                    }
//                }
//            }else{
//                result.append(new Resp(SdkCodeEnums.ERR.getCode(), SdkCodeEnums.ERR.getMsg()));
//            }
//        } catch (IOException e) {
//            //System.out.println(123+e.getMessage());
//            result.append(new Resp(SdkCodeEnums.ERR.getCode(),e.getMessage()));
//            //e.printStackTrace();
//        } finally {
//            if (null != br) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (null != is) {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            //关闭远程连接
//            if(connection!=null){
//                connection.disconnect();
//            }
//        }
//        return result.toString();
    }



    private String execute(String httpUrl, String param,String type) {
        StringBuffer result = new StringBuffer();
        //连接
        HttpURLConnection connection = null;
        OutputStream os = null;
        InputStream is = null;
        BufferedReader br = null;
        try {
            //创建连接对象
            URL url = new URL(httpUrl);
            //创建连接
            connection = (HttpURLConnection) url.openConnection();
            //设置请求方法
            connection.setRequestMethod(type);
            //设置连接超时时间
            connection.setConnectTimeout(15000);
            //设置读取超时时间
            connection.setReadTimeout(15000);
            //DoOutput设置是否向httpUrlConnection输出，DoInput设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
            //设置是否可读取
            connection.setDoOutput(true);
            connection.setDoInput(true);
            //设置通用的请求属性
            buildConnetHeader(connection);
            //拼装参数
            if (null != param && !param.equals("")) {
                //设置参数
                os = connection.getOutputStream();
                //拼装参数
                os.write(param.getBytes("UTF-8"));
            }
            //设置权限
            //设置请求头等
            //开启连接
            connection.connect();
            //请求打印
            System.out.println("请求httpUrl："+httpUrl+" 请求param："+param
                    +" 请求Header参数：Sign："+connection.getRequestProperty("Sign")
                    +" Api-Key："+connection.getRequestProperty("Api-Key")
                    +" Timestamp："+connection.getRequestProperty("Timestamp"));

            //读取响应
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                if (null != is) {
                    br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    String temp = null;
                    while (null != (temp = br.readLine())) {
                        result.append(temp);
                        result.append("\r\n");
                    }
                }
            }else{
                result.append(new Resp(SdkCodeEnums.ERR.getCode(), SdkCodeEnums.ERR.getMsg().concat("#urlRespCode()=").concat(connection.getResponseCode()+"#")));
            }

        } 
//        catch (MalformedURLException e) {
//            result.append(new Resp(SdkCodeEnums.ERR.getCode(),e.getMessage()));
//            //e.printStackTrace();
//        }
        catch (IOException e) {
            result.append(new Resp(SdkCodeEnums.ERR.getCode(),e.getMessage()));
            //e.printStackTrace();
        } finally {
            //关闭连接
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //关闭远程连接
            if(connection!=null){
                connection.disconnect();
            }
        }
        return result.toString();
    }


    private  void buildConnetHeader(HttpURLConnection connection) {
        final String datetime = String.valueOf(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().getEpochSecond());
        final String sign = MD5Util.MD5Encode(key.concat(secret).concat(datetime),"utf8");
        connection.setRequestProperty("accept", "*/*");
        connection.setRequestProperty("connection", "Keep-Alive");
        connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
        connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
        connection.setRequestProperty("Sign", sign);
        connection.setRequestProperty("Timestamp", datetime);
        connection.setRequestProperty("Api-Key", key);
        //set Request source
        connection.setRequestProperty("origin", "java-sdk");
    }

}
