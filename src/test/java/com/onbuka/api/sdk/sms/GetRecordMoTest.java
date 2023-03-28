package com.onbuka.api.sdk.sms;

import com.onbuka.api.sdk.client.SmsSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.smsdto.RecordMoDTO;
import com.onbuka.api.sdk.model.smsdto.RecordMoInfoDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/10
 * @description SmsSdkClientGetReportByTimeSlotTest
 */
public class GetRecordMoTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("youKey","youSecret");
          SmsSdkClient smsSdkClient = SmsSdkClient.getInstance(apiData);
          RecordMoDTO recordMoDTO = new RecordMoDTO();
          recordMoDTO.setAppId("appId");
          recordMoDTO.setCurrent(1);
          recordMoDTO.setSize(15);
          RecordMoInfoDTO recordMoInfoDTO = new RecordMoInfoDTO();
          recordMoInfoDTO.setStrTime("satrtTime");
          recordMoInfoDTO.setEndTime("endTime");
          recordMoDTO.setParams(recordMoInfoDTO);
          String result = smsSdkClient.recordMo(recordMoDTO);
     }




}
