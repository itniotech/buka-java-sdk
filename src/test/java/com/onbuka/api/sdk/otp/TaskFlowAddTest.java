package com.onbuka.api.sdk.otp;

import com.onbuka.api.sdk.client.OtpSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.FlowDTO;
import com.onbuka.api.sdk.model.otpdto.TaskFlowDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/15
 * @description TaskFlowAddTest
 */
public class TaskFlowAddTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          TaskFlowDTO taskFlowDTO = new TaskFlowDTO();
          List<FlowDTO> flow = new ArrayList<>();
          taskFlowDTO.setName("test task flow");

          FlowDTO flowDTO = new FlowDTO();
          flowDTO.setStatus(1);
          flowDTO.setChannelCut(1);
          flowDTO.setChannel("channel");
          flowDTO.setWaitingTime(123456789);
          flow.add(flowDTO);

          FlowDTO flowDTO1 = new FlowDTO();
          flowDTO1.setStatus(1);
          flowDTO1.setChannelCut(1);
          flowDTO1.setChannel("channel");
          flowDTO1.setWaitingTime(123456789);
          flow.add(flowDTO1);
          taskFlowDTO.setFlow(flow);
          String result = otpSdkClient.flowAdd(taskFlowDTO);
     }




}
