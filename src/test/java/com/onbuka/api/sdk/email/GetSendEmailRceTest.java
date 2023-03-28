package com.onbuka.api.sdk.email;

import com.onbuka.api.sdk.client.EmailSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.emaildto.SendEmailDTO;
import com.onbuka.api.sdk.model.emaildto.SendEmailRcdDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 10:08:02
 * @description SendEmailTest
 */
public class GetSendEmailRceTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("youKey","youSecret");
        EmailSdkClient emailSdkClient = EmailSdkClient.getInstance(apiData);
        SendEmailRcdDTO sendEmailRcdDTO = new SendEmailRcdDTO();
        sendEmailRcdDTO.setAppId("appId");
        sendEmailRcdDTO.setEmailId("emailId");
        String result = emailSdkClient.getSendEmailRcd(sendEmailRcdDTO);

    }
}
