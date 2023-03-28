package com.onbuka.api.sdk.model.smsdto;

/**
 * @author rch
 * @createTime 2023/03/09 17:48:14
 * @version: 1.0.0
 * @description reportDto
 */
public class ReportDTO {

    private String appId;

    private String msgIds;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMsgIds() {
        return msgIds;
    }

    public void setMsgIds(String msgIds) {
        this.msgIds = msgIds;
    }

    @Override
    public String toString() {
        return "?appId=" + appId +"&msgIds=" + msgIds ;
    }
}
