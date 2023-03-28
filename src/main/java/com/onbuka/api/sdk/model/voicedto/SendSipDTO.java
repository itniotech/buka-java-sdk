package com.onbuka.api.sdk.model.voicedto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:19:10
 * @description SendSipDTO
 */
public class SendSipDTO {


    /**
     * Called number: 7-15 digits composed of national code + mobile phone number.
     */
    private String callee;
    /**
     * Display number: 7-15 digits or null.
     */
    private String displayNum;
    /**
     * Phone account
     */
    private String account;
    /**
     * Audio application ID
     */
    private String appId;


    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }

    public String getDisplayNum() {
        return displayNum;
    }

    public void setDisplayNum(String displayNum) {
        this.displayNum = displayNum;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
