package com.onbuka.api.sdk.voice;

import com.onbuka.api.sdk.client.VoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.voicedto.QueryDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:30:45
 * @description RecordGroupQueryTest
 */
public class RecordGroupQueryTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        VoiceSdkClient voiceSdkClient = VoiceSdkClient.getInstance(apiData);
        QueryDTO queryDTO = new QueryDTO();
        queryDTO.setCurrent(1);
        queryDTO.setSize(1);
        Map params = new HashMap<>();
        params.put("strTime","strTime");
        params.put("endTime","endTime");
        queryDTO.setParams(params);
        String result =  voiceSdkClient.recordGroupQuery(queryDTO);
    }
}
