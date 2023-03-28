package com.onbuka.api.sdk.aivoice;

import com.onbuka.api.sdk.client.AiVoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.utils.JsonUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 11:47:26
 * @description DialogFlowListTest
 */
public class DialogFlowListTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        AiVoiceSdkClient aiVoiceSdkClient = AiVoiceSdkClient.getInstance(apiData);
        String appId = "appId";
        String result = aiVoiceSdkClient.dialogFlowList(appId);
    }
}
