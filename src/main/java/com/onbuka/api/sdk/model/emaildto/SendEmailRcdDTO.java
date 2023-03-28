package com.onbuka.api.sdk.model.emaildto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 10:04:59
 * @description SendEmailRcdDTO
 */
public class SendEmailRcdDTO {

    /**
     * Application id (mail-mail application)
     */
    private String appId;


    /**
     * sendEmail interface response returns the platform id, batchSendEmail interface platform callback ID, multiple separated by English commas. Maximum 200 emailIds for a single query
     */
    private String emailId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
