package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.VerificationOrderRecordDTO;
import com.onbuka.api.sdk.model.otpdto.VerificationSendRuleDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description VerificationSendRuleTest
 */
public class VerificationSendRuleTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          VerificationSendRuleDTO verificationSendRuleDTO = new VerificationSendRuleDTO();
          verificationSendRuleDTO.setAppId("appId");
          verificationSendRuleDTO.setOrderId("orderId");
          verificationSendRuleDTO.setCode("code");
          verificationSendRuleDTO.setChannel("channel");
          verificationSendRuleDTO.setFlowId(1);
          verificationSendRuleDTO.setTo("to");
          verificationSendRuleDTO.setTemplateId(1);
          String result = otpSdkClient.verificationSendRule(verificationSendRuleDTO);
     }




}
