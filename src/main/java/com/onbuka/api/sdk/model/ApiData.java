package com.onbuka.api.sdk.model;

import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.utils.DataUtil;

/**
 * @author rch
 * @createTime 2023/3/6 11:22:59
 * @version 1.0
 * @description api key & secret & url
 */

public class ApiData {

    private String key;

    private String secret;

    private String baseUrl;


    /**
     * @author: ruanchuanhui
     * @createTime: 2023/3/10
     * @description: ApiData init
     * @param: key
     * @param: secret
     * @param: url
     * @return: null
     */
    public ApiData(String key, String secret,String...baseUrl) {
        this.key = key;
        this.secret = secret;
        this.baseUrl = DataUtil.getBaseApiUrl(baseUrl, ApiEnums.BASEURL);
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
}
