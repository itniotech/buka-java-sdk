package com.onbuka.api.sdk.model.otpdto;

import com.onbuka.api.sdk.utils.JsonUtil;

import java.util.Map;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 17:54:26
 * @description VerificationCodeDTO
 */
public class VerificationCodeDTO {


    private String appId;
    private String name;
    private Integer codeExpiry;

    private Map periodTotalSendLimit;

    private Map periodPhoneSendLimit;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCodeExpiry() {
        return codeExpiry;
    }

    public void setCodeExpiry(Integer codeExpiry) {
        this.codeExpiry = codeExpiry;
    }


    public Map getPeriodTotalSendLimit() {
        return periodTotalSendLimit;
    }

    public void setPeriodTotalSendLimit(Map periodTotalSendLimit) {
        this.periodTotalSendLimit = periodTotalSendLimit;
    }

    public Map getPeriodPhoneSendLimit() {
        return periodPhoneSendLimit;
    }

    public void setPeriodPhoneSendLimit(Map periodPhoneSendLimit) {
        this.periodPhoneSendLimit = periodPhoneSendLimit;
    }
}
