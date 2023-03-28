package com.onbuka.api.sdk.model.smsdto;

/**
 * @author rch
 * @createTime 2023/3/9 16:45:21
 * @version 1.0.0
 * @description SendSmsDto
 */
public class SendSmsDTO {

    /**
     * The appId you want to send SMS
     */
    private String appId;

    /**
     * Phone number to send
     */
    private String numbers;

    /**
     * Message content to be sent
     */
    private String content;

    /**
     * Custom Sender Id
     */
    private String senderId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

}
