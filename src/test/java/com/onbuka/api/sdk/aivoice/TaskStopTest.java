package com.onbuka.api.sdk.aivoice;

import com.onbuka.api.sdk.client.AiVoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.aivoicedto.TaskBaseDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 11:47:26
 * @description TaskStopTest
 */
public class TaskStopTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        AiVoiceSdkClient aiVoiceSdkClient = AiVoiceSdkClient.getInstance(apiData);
        TaskBaseDTO taskBaseDTO = new TaskBaseDTO();
        taskBaseDTO.setAppId("appId");
        taskBaseDTO.setJobId(1L);
        String result = aiVoiceSdkClient.taskStop(taskBaseDTO);
    }
}
