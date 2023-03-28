package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.TemplateDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description TemplateAddTest
 */
public class TemplateAddTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          TemplateDTO templateDTO = new TemplateDTO();
          templateDTO.setAppId("appId");
          templateDTO.setCodeLength(1);
          templateDTO.setCodeType(1);
          templateDTO.setLanguage("CN");
          templateDTO.setName("name");
          templateDTO.setMaxDuration(2);
          templateDTO.setText("text");
          templateDTO.setRepeatCnt(3);
          templateDTO.setSpeechRate(4);
          templateDTO.setSenderId("senderId");
          String result = otpSdkClient.templateAdd(templateDTO);
     }




}
