package com.onbuka.api.sdk.voice;

import com.onbuka.api.sdk.client.VoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.voicedto.SendCodeDTO;
import com.onbuka.api.sdk.model.voicedto.SendGroupDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:30:45
 * @description FileQueryTest
 */
public class SendCodeTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        VoiceSdkClient voiceSdkClient = VoiceSdkClient.getInstance(apiData);
        SendCodeDTO sendCodeDTO = new SendCodeDTO();
        sendCodeDTO.setCallee("callee");
        sendCodeDTO.setDisplayNum("displayNum");
        sendCodeDTO.setAppId("appId");
        sendCodeDTO.setLanguage("EN");
        sendCodeDTO.setText("text");
        sendCodeDTO.setLoopCount(1);
        String result =  voiceSdkClient.sendCode(sendCodeDTO);
    }
}
