package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.VerifyDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description VerificationRecordTest
 */
public class VerificationRecordTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          String verificationId = "verificationId";
          String result = otpSdkClient.verificationRecord(verificationId);
     }




}
