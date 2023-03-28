package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.VerificationCodeDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description AppAddTest
 */
public class AppAddTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          VerificationCodeDTO verificationCodeDTO = new VerificationCodeDTO();
          verificationCodeDTO.setName("name");
          verificationCodeDTO.setCodeExpiry(123);
          Map periodTotalSendLimit = new HashMap();
          periodTotalSendLimit.put("enabled",true);
          periodTotalSendLimit.put("unit",100);
          periodTotalSendLimit.put("period",1);
          periodTotalSendLimit.put("limit",2);
          Map periodPhoneSendLimit = new HashMap();
          periodPhoneSendLimit.put("enabled",true);
          periodPhoneSendLimit.put("unit",100);
          periodPhoneSendLimit.put("period",1);
          periodPhoneSendLimit.put("limit",2);
          verificationCodeDTO.setPeriodPhoneSendLimit(periodPhoneSendLimit);
          verificationCodeDTO.setPeriodTotalSendLimit(periodTotalSendLimit);
          String result = otpSdkClient.appAdd(verificationCodeDTO);
     }




}
