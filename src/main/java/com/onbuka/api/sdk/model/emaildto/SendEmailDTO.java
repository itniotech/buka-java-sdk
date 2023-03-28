package com.onbuka.api.sdk.model.emaildto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 09:47:36
 * @description sendEmailDTO
 */
public class SendEmailDTO {
    /**
     * Application id (mail-mail application)
     */
    private String appId;

    /**
     * The Mail address configured in the BUKA, For example, noreply@mail.buka.com
     */
    private String fromEmailAddress;

    /**
     * Recipient addresses, multiple email addresses can be separated by English commas, up to 50 addresses. If you have more recipients, you can use the Batch Send Email API. For example, noreply@smail.buka.com, noreply1@mail.buka.com
     */
    private String toAddress;


    /**
     * Email subject, recommended to fill in, word limit (1~100 characters)
     */
    private String subject;


    /**
     * Template IDs configured in the BUKA for review and approval
     */
    private String templateID;

    /**
     * If there are variable parameters in the template, it is recommended to pass the value key-value when sending, For example, { "code":"1234" }
     */
    private String templateData;

    /**
     * Whether to add an ad tag. 0: Add no tag; 1: Add before the subject; 2: Add after the subject.
     */
    private Integer adFlag;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFromEmailAddress() {
        return fromEmailAddress;
    }

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTemplateID() {
        return templateID;
    }

    public void setTemplateID(String templateID) {
        this.templateID = templateID;
    }

    public String getTemplateData() {
        return templateData;
    }

    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    public Integer getAdFlag() {
        return adFlag;
    }

    public void setAdFlag(Integer adFlag) {
        this.adFlag = adFlag;
    }
}
