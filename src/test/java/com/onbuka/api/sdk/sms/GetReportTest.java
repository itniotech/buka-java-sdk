package com.onbuka.api.sdk.sms;

import com.onbuka.api.sdk.client.SmsSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.smsdto.ReportDTO;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/10
 * @description SmsSdkClientGetReportTest
 */
public class GetReportTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("youKey","youSecret");
          SmsSdkClient smsSdkClient = SmsSdkClient.getInstance(apiData);
          ReportDTO reportDTO = new ReportDTO();
          reportDTO.setAppId("appId");
          reportDTO.setMsgIds("123,456");
          String result = smsSdkClient.getReport(reportDTO);
     }




}
