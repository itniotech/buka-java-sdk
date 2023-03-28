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
 * @description sipQuery
 */
public class SipQueryTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        VoiceSdkClient voiceSdkClient = VoiceSdkClient.getInstance(apiData);
        QueryDTO sipQueryDTO = new QueryDTO();
        Map params = new HashMap<>();
        params.put("appId","appId");
        sipQueryDTO.setParams(params);
        sipQueryDTO.setCurrent(1);
        sipQueryDTO.setSize(1);
        String result =  voiceSdkClient.sipQuery(sipQueryDTO);
    }
}
