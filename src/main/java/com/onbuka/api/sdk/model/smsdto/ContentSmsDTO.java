package com.onbuka.api.sdk.model.smsdto;

import java.util.List;

/**
 * @author rch
 * @createTime 2023/3/9 16:45:21
 * @version 1.0.0
 * @description SendSmsDto
 */
public class ContentSmsDTO {

    /**
     * SMS Receiving Phone Number(COMMA required between each phone number)
     */
    private String numbers;

    /**
     * SMS content, length should not be over the 1024 characters.(GET should use urlEncode)
     */
    private String content;

    /**
     * sender number(name)
     */
    private String senderId;
    /**
     * customer id
     */
    private String orderId;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "{" +
                "\"numbers\":\"" + numbers + '\"' +
                ",\" content\":\"" + content + '\"' +
                ", \"senderId\":\"" + senderId + '\"' +
                ", \"orderId\":\"" + orderId + '\"' +
                '}';
    }
}
