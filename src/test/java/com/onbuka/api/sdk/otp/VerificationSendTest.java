package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.VerificationDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description TemplateAddTest
 */
public class VerificationSendTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          VerificationDTO verificationDTO = new VerificationDTO();
          verificationDTO.setTemplateId(1);
          verificationDTO.setChannel("channel");
          verificationDTO.setAppId("appId");
          verificationDTO.setTo("to");
          verificationDTO.setFlowId(1);
          verificationDTO.setOrderId("2");
          String result = otpSdkClient.verificationSend(verificationDTO);
     }




}
