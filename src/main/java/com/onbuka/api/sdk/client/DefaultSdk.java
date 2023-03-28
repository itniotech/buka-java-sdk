package com.onbuka.api.sdk.client;


import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.utils.HttpUtil;

/**
 * @author rch
 * @createTime 2023/3/7 104111
 * @version 1.0
 * @description defaultSdk
 */
public interface DefaultSdk {
     /**
      * @author ruanchuanhui
      * @createTime 2023/3/7
      * @description get httpClient
      * @param apiData api key & secret & url
      * @return HttpUtil
      */
     HttpUtil getHttpUtil(ApiData apiData);


}
