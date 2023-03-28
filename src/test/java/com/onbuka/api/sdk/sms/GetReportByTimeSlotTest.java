package com.onbuka.api.sdk.sms;

import com.onbuka.api.sdk.client.SmsSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.smsdto.ReportTimeDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/10
 * @description SmsSdkClientGetReportByTimeSlotTest
 */
public class GetReportByTimeSlotTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("youKey","youSecret");
          SmsSdkClient smsSdkClient = SmsSdkClient.getInstance(apiData);
          ReportTimeDTO reportTimeDTO = new ReportTimeDTO();
          reportTimeDTO.setAppId("appId");
          reportTimeDTO.setStartTime("startTime");
          reportTimeDTO.setEndTime("endTime");
          String result = smsSdkClient.getSentRcd(reportTimeDTO);

     }




}
