package com.onbuka.api.sdk.voice;

import com.onbuka.api.sdk.client.VoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.voicedto.SipResetDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:30:45
 * @description RecordSipTest
 */
public class RecordSipTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        VoiceSdkClient voiceSdkClient = VoiceSdkClient.getInstance(apiData);
        String voiceId = "voiceId";
        String result =  voiceSdkClient.recordSip(voiceId);
    }
}
