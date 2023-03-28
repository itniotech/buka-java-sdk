package com.onbuka.api.sdk.model.otpdto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 17:52:39
 * @description VerificationOrderRecordDTO
 */
public class VerificationOrderRecordDTO {

    private String orderId;
    private String appId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
