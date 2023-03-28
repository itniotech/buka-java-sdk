package com.onbuka.api.sdk.email;

import com.onbuka.api.sdk.client.EmailSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.emaildto.EmailReceiverDTO;
import com.onbuka.api.sdk.model.emaildto.EmailTemplateDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/23/14 10:08:02
 * @description GetListReceiversTest
 */
public class GetListReceiversTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("youKey","youSecret");
        EmailSdkClient emailSdkClient = EmailSdkClient.getInstance(apiData);
        EmailReceiverDTO receiverDTO = new EmailReceiverDTO();
        receiverDTO.setAppId("appId");
        receiverDTO.setReceiversName("name");
        String result = emailSdkClient.getListReceivers(receiverDTO);
    }
}
