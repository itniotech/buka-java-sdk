package com.onbuka.api.sdk.account;

import com.onbuka.api.sdk.client.AccountSdkClient;
import com.onbuka.api.sdk.model.ApiData;

/**
 * @author rch
 * @createTime 2023/03/09 17:03:21
 * @version 1.0.0
 * @description smsSdkClientTest
 */
public class GetBalanceTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("key","secret");
          AccountSdkClient accountSdkClient = AccountSdkClient.getInstance(apiData);
          String result = accountSdkClient.getbalanceV3();
     }




}
