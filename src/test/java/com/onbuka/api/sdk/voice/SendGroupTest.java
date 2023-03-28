package com.onbuka.api.sdk.voice;

import com.onbuka.api.sdk.client.VoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.voicedto.SendGroupDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:30:45
 * @description FileQueryTest
 */
public class SendGroupTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        VoiceSdkClient voiceSdkClient = VoiceSdkClient.getInstance(apiData);
        SendGroupDTO sendGroupDTO = new SendGroupDTO();
        sendGroupDTO.setCallee("callee");
        sendGroupDTO.setDisplayNum("displayNum");
        sendGroupDTO.setFileId("fileId");
        sendGroupDTO.setAppId("appId");
        sendGroupDTO.setMaxDuration(12313155);
        sendGroupDTO.setLoopCount(1);
        String result =  voiceSdkClient.sendGroup(sendGroupDTO);
    }
}
