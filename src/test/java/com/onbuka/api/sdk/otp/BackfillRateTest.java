package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.BackfillRateDTO;
import com.onbuka.api.sdk.model.otpdto.VerifyDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description BackfillRateTest
 */
public class BackfillRateTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          BackfillRateDTO backfillRateDTO = new BackfillRateDTO();
          backfillRateDTO.setBackfillNow("BackfillNow");
          backfillRateDTO.setBackfillCardinalNumber("number");
          backfillRateDTO.setBackfillNumber("number");
          backfillRateDTO.setAppId("appId");
          backfillRateDTO.setMcc("mcc");
          backfillRateDTO.setCallbackTime("time");
          String result = otpSdkClient.backfillRate(backfillRateDTO);
     }




}
