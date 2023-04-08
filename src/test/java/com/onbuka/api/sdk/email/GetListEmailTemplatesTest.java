package com.onbuka.api.sdk.email;

import com.onbuka.api.sdk.client.EmailSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.emaildto.EmailTemplateDTO;
import com.onbuka.api.sdk.model.emaildto.SendEmailDTO;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/23/14 10:08:02
 * @description GetListEmailTemplatesTest
 */
public class GetListEmailTemplatesTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("youKey","youSecret");
        EmailSdkClient emailSdkClient = EmailSdkClient.getInstance(apiData);
        EmailTemplateDTO emailTemplateDTO = new EmailTemplateDTO();
        emailTemplateDTO.setAppId("appId");
        emailTemplateDTO.setTemplateName("templateName");
        emailTemplateDTO.setTemplateStatus(1);
        emailTemplateDTO.setLanguage("en");
        String result = emailSdkClient.getListEmailTemplates(emailTemplateDTO);



    }
}
