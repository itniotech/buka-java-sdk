package com.onbuka.api.sdk.utils;

import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.enums.SdkCodeEnums;
import com.onbuka.api.sdk.resp.Resp;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/11 14:41:16
 * @description resultDataUtil
 */
public class DataUtil {

    public static String getResultData(String res) {
        if(res!="" && res !=null){
            return res;
        }
        return new Resp(SdkCodeEnums.ERR.getCode(), SdkCodeEnums.ERR.getMsg()).toString();
    }


    public static String getApi(String baseUrl,ApiEnums apiEnums) {
        return baseUrl.concat(apiEnums.getUrl());
    }
    public static String getBaseApiUrl(String[] args,ApiEnums apiEnums) {
       String baseUrl = apiEnums.getUrl();
        if (args!=null && args.length > 0) {
            if(args[0]!=null && args[0]!=""){
                baseUrl = args[0];
            }
        }
        return baseUrl;
    }


    public static String buildUrl(String str, String url) {
        if(url.lastIndexOf(str)==-1){
            if(!url.endsWith("/")){
                url = url.concat("/");
            }
            url = url.concat(str);
        }
        return url;
    }

}
