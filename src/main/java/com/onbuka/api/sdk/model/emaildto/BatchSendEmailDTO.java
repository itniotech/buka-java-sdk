package com.onbuka.api.sdk.model.emaildto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 09:47:36
 * @description BatchSendEmailDTO
 */
public class BatchSendEmailDTO {
    /**
     * Application id (mail-mail application)
     */
    private String appId;

    /**
     * The Mail address configured in the BUKA, For example, noreply@mail.buka.com
     */
    private String fromEmailAddress;

    /**
     * Recipient list ID configured in buka platform. If there is a variable, the value of the variable in the template will be taken when sending
     */
    private String receiverId;


    /**
     * Email subject, recommended to fill in, word limit (1~100 characters)
     */
    private String subject;


    /**
     * Template IDs configured in the BUKA for review and approval
     */
    private String templateID;

    /**
     *Callback URL
     */
    private String url;

    /**
     * Whether to add an ad tag. 0: Add no tag; 1: Add before the subject; 2: Add after the subject.
     */
    private Integer adFlag;

    private String language;

    private Integer triggerID;

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

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getAdFlag() {
        return adFlag;
    }

    public void setAdFlag(Integer adFlag) {
        this.adFlag = adFlag;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getTriggerID() {
        return triggerID;
    }

    public void setTriggerID(Integer triggerID) {
        this.triggerID = triggerID;
    }
}
