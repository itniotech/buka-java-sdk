package com.onbuka.api.sdk.sms;

import com.onbuka.api.sdk.client.SmsSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.smsdto.SendSmsDTO;

/**
 * @author rch
 * @createTime 2023/03/09 17:03:21
 * @version 1.0.0
 * @Description smsSdkClientTest
 */
public class SendSmsTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("youKey","youSecret");
          SmsSdkClient smsSdkClient = SmsSdkClient.getInstance(apiData);
          SendSmsDTO sendSmsDTO = new SendSmsDTO();
          sendSmsDTO.setAppId("appId");
          sendSmsDTO.setNumbers("numbers");
          sendSmsDTO.setSenderId("senderId");
          sendSmsDTO.setContent("content");
          String result =  smsSdkClient.sendSmsV3(sendSmsDTO);

     }




}
