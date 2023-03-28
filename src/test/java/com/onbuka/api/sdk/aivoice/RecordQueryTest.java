package com.onbuka.api.sdk.aivoice;

import com.onbuka.api.sdk.client.AiVoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.aivoicedto.InactiveDateDTO;
import com.onbuka.api.sdk.model.aivoicedto.InactiveTimeDTO;
import com.onbuka.api.sdk.model.aivoicedto.OutboundTaskDTO;
import com.onbuka.api.sdk.model.aivoicedto.TaskQueryDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 11:47:26
 * @description RecordQueryTest
 */
public class RecordQueryTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        AiVoiceSdkClient aiVoiceSdkClient = AiVoiceSdkClient.getInstance(apiData);
        TaskQueryDTO taskQueryDTO = new TaskQueryDTO();
        taskQueryDTO.setCurrent(1);
        taskQueryDTO.setSize(15);
        Map params = new HashMap<>();
        params.put("appId","appId");
        params.put("startTime","startTime");
        params.put("endTime","endTime");
        taskQueryDTO.setParams(params);
        String result = aiVoiceSdkClient.recordQuery(taskQueryDTO);
    }
}
