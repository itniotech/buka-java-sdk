package com.onbuka.api.sdk.model.otpdto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 17:52:39
 * @description VerificationSendRuleDTO
 */
public class VerificationSendRuleDTO {

    private String appId;
    private Integer templateId;
    private String code;
    private Integer flowId;
    private String to;
    private String channel;
    private String orderId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
