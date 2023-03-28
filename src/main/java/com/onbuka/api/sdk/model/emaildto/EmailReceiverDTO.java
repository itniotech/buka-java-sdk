package com.onbuka.api.sdk.model.emaildto;

public class EmailReceiverDTO {

    private String appId;
    private String receiversName;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getReceiversName() {
        return receiversName;
    }

    public void setReceiversName(String receiversName) {
        this.receiversName = receiversName;
    }
}
