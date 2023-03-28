package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.VerificationOrderRecordDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description VerificationOrderRecordTest
 */
public class VerificationOrderRecordTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          VerificationOrderRecordDTO verificationOrderRecordDTO = new VerificationOrderRecordDTO();
          verificationOrderRecordDTO.setOrderId("orderId");
          verificationOrderRecordDTO.setAppId("appId");
          String result = otpSdkClient.verificationOrderRecord(verificationOrderRecordDTO);
     }




}
