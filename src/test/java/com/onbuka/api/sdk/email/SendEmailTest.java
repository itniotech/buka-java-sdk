package com.onbuka.api.sdk.email;

import com.onbuka.api.sdk.client.EmailSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.emaildto.SendEmailDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 10:08:02
 * @description SendEmailTest
 */
public class SendEmailTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("youKey","youSecret");
        EmailSdkClient emailSdkClient = EmailSdkClient.getInstance(apiData);
        SendEmailDTO sendEmailDTO = new SendEmailDTO();
        sendEmailDTO.setAppId("appId");
        sendEmailDTO.setFromEmailAddress("fromEmailAddress");
        sendEmailDTO.setToAddress("toAdress");
        sendEmailDTO.setSubject("subject");
        sendEmailDTO.setTemplateID("tempId");
        sendEmailDTO.setTemplateData("tempData");
        sendEmailDTO.setAdFlag(1);
        String result = emailSdkClient.sendEmail(sendEmailDTO);



    }
}
