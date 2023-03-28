package com.onbuka.api.sdk.model.voicedto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:19:10
 * @description SipSTO
 */
public class SipDTO {


    /**
     * Name of phone group: 4-32 characters,no repetition is allowed under the same application.
     */
    private String groupName;
    /**
     * Phone name: 4-32 characters, no repetition is allowed under the same application.
     */
    private String phoneName;
    /**
     * Number of phones, interval: 1-50
     */
    private Integer quantity;
    /**
     * Display number, 7-13 digits
     */
    private String displayNum;
    /**
     * Audio application ID
     */
    private String appId;


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDisplayNum() {
        return displayNum;
    }

    public void setDisplayNum(String displayNum) {
        this.displayNum = displayNum;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }



}
