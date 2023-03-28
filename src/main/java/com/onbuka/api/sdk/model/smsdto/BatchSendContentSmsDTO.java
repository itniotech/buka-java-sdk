package com.onbuka.api.sdk.model.smsdto;

import java.util.List;

/**
 * @author rch
 * @createTime 2023/3/9 16:45:21
 * @version 1.0.0
 * @description SendSmsDto
 */
public class BatchSendContentSmsDTO {

    /**
     * App ID (SMS-SMS APP)
     */
    private String appId;

    /**
     * Json gather
     */
    private List<ContentSmsDTO> array;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<ContentSmsDTO> getArray() {
        return array;
    }

    public void setArray(List<ContentSmsDTO> array) {
        this.array = array;
    }

//    @Override
//    public String toString() {
//        return "{" +
//                "\"appId\":\"" + appId + '\"' +
//                ",\" array\":\"" + numbers + '\"' +
//                ", \"content\":\"" + content + '\"' +
//                ", \"senderId\":\"" + senderId + '\"' +
//                '}';
//    }
}
