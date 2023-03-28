package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description AppDetailsTest
 */
public class AppDetailsTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          String appId = "appId";
          String result = otpSdkClient.appDetails(appId);
     }




}
