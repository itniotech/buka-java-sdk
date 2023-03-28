package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.VerificationResendDTO;
import com.onbuka.api.sdk.model.otpdto.VerifyDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description VerificationVerifyTest
 */
public class VerificationVerifyTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          VerifyDTO verifyDTO = new VerifyDTO();
          verifyDTO.setVerificationId("verificationId");
          verifyDTO.setCode("code");
          String result = otpSdkClient.verificationVerify(verifyDTO);
     }




}
