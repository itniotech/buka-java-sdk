package com.onbuka.api.sdk.sms;

import com.onbuka.api.sdk.client.SmsSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.smsdto.BatchSendContentSmsDTO;
import com.onbuka.api.sdk.model.smsdto.ContentSmsDTO;
import com.onbuka.api.sdk.model.smsdto.SendSmsDTO;
import com.onbuka.api.sdk.utils.JsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rch
 * @createTime 2023/03/09 17:03:21
 * @version 1.0.0
 * @Description smsSdkClientTest
 */
public class BatchSendSmsTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("youKey","youSecret");
          SmsSdkClient smsSdkClient = SmsSdkClient.getInstance(apiData);
          BatchSendContentSmsDTO batchSendContentSmsDTO = new BatchSendContentSmsDTO();
          batchSendContentSmsDTO.setAppId("123");
          List<ContentSmsDTO> contentSmsDTOList = new ArrayList<>();
          ContentSmsDTO contentSmsDTO = new ContentSmsDTO();
          contentSmsDTO.setContent("test123");
          contentSmsDTO.setNumbers("123,456");
          contentSmsDTO.setOrderId("1");
          contentSmsDTO.setSenderId("123");
          ContentSmsDTO contentSmsDTO1 = new ContentSmsDTO();
          contentSmsDTO1.setContent("test456");
          contentSmsDTO1.setNumbers("123,456");
          contentSmsDTO1.setOrderId("2");
          contentSmsDTO1.setSenderId("456");
          contentSmsDTOList.add(contentSmsDTO);
          contentSmsDTOList.add(contentSmsDTO1);
          batchSendContentSmsDTO.setArray(contentSmsDTOList);
          String result =  smsSdkClient.batchSendSms(batchSendContentSmsDTO);
     }




}
