package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.VerificationDTO;
import com.onbuka.api.sdk.model.otpdto.VerificationResendDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description TemplateAddTest
 */
public class VerificationResendTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          VerificationResendDTO verificationResendDTO = new VerificationResendDTO();
          verificationResendDTO.setVerificationId("verificationId");
          verificationResendDTO.setChannel("channel");
          String result = otpSdkClient.verificationResend(verificationResendDTO);
     }




}
