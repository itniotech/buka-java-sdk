package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.TemplateDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description TemplateAddTest
 */
public class TemplateDetailsTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("key","secret");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          int templateId = 123;
          String result = otpSdkClient.templateDetails(templateId);
     }




}
