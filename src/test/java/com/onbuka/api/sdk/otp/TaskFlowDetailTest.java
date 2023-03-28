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
 * @description TaskFlowDetailTest
 */
public class TaskFlowDetailTest {
     public static void main(String[] args) {
          ApiData apiData = new ApiData("5RRQlcSG","G7dFKhVy");
          OtpSdkClient otpSdkClient = OtpSdkClient.getInstance(apiData);
          String flowId = "flowId";
          String result = otpSdkClient.flowDetails(flowId);
     }




}
