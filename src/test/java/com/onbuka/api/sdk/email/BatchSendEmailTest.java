package com.onbuka.api.sdk.email;

import com.onbuka.api.sdk.client.EmailSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.emaildto.BatchSendEmailDTO;
import com.onbuka.api.sdk.model.emaildto.SendEmailDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 10:08:02
 * @description BatchSendEmailTest
 */
public class BatchSendEmailTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("youKey","youSecret");
        EmailSdkClient emailSdkClient = EmailSdkClient.getInstance(apiData);
        BatchSendEmailDTO batchSendEmailDTO = new BatchSendEmailDTO();
        batchSendEmailDTO.setAppId("appId");
        batchSendEmailDTO.setFromEmailAddress("fromEmailAddress");
        batchSendEmailDTO.setReceiverId("receiverId");
        batchSendEmailDTO.setSubject("subject");
        batchSendEmailDTO.setTemplateID("tempId");
        batchSendEmailDTO.setAdFlag(1);
        String result = emailSdkClient.batchSendEmail(batchSendEmailDTO);



    }
}
