package com.onbuka.api.sdk.voice;

import com.onbuka.api.sdk.client.VoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.voicedto.FileUploadDTO;
import com.onbuka.api.sdk.model.voicedto.SipResetDTO;

import java.io.File;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:30:45
 * @description FileUploadTest
 */
public class FileUploadTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        VoiceSdkClient voiceSdkClient = VoiceSdkClient.getInstance(apiData);
        FileUploadDTO fileUploadDTO = new FileUploadDTO();
        fileUploadDTO.setFileName("test.mp3");
        fileUploadDTO.setOriginalFile(new File("D:\\11582.mp3"));
        String result =  voiceSdkClient.fileUpload(fileUploadDTO);
    }
}
