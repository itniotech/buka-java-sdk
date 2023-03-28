package com.onbuka.api.sdk.client;


import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.utils.HttpUtil;
import com.onbuka.api.sdk.utils.DataUtil;

/**
 * @author rch
 * @createTime 2023/3/6
 * @version 1.0
 * @description userSdk
 */
public class AccountSdkClient implements DefaultSdk{

    volatile public static AccountSdkClient instance;
    private HttpUtil httpUtil;

    AccountSdkClient(ApiData apiData){
    this.httpUtil =  getHttpUtil(apiData);
    }

    public static AccountSdkClient getInstance(ApiData apiData) {
        return new AccountSdkClient(apiData);
    }

    @Override
    public HttpUtil getHttpUtil(ApiData apiData) {
        return new HttpUtil(apiData);
    }


 /**
  * @author rch
  * @createTime 2023/3/9
  * @description The protocol is used to get account balance
  * @param
  * @return java.lang.String
  */
    public String getbalanceV3() {
        return DataUtil.getResultData(httpUtil.doGet(DataUtil.getApi(httpUtil.getBaseUrl(),ApiEnums.GETBALANCE)));
    }


}
