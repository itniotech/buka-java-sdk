package com.onbuka.api.sdk.voice;

import com.onbuka.api.sdk.client.VoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.voicedto.SipDTO;
import com.onbuka.api.sdk.utils.JsonUtil;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:30:45
 * @description sipAddTest
 */
public class SipAddTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        VoiceSdkClient voiceSdkClient = VoiceSdkClient.getInstance(apiData);
        SipDTO sipDTO = new SipDTO();
        sipDTO.setAppId("appId");
        sipDTO.setPhoneName("sip");
        sipDTO.setQuantity(1);
        sipDTO.setDisplayNum("7777777");
        sipDTO.setGroupName("sipGroup");
        String result =  voiceSdkClient.sipAdd(sipDTO);
    }
}
