package com.onbuka.api.sdk.model.voicedto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:19:10
 * @description SendGroupDTO
 */
public class SendGroupDTO {


    /**
     * Called number: up to 200 mobile phone numbers. Different mobile phone numbers should be separated by a comma. Each mobile phone number: 7-15 digits composed of national code + mobile phone number.
     */
    private String callee;
    /**
     * Display number: 7-15 digits or null.
     */
    private String displayNum;
    /**
     * Uploaded audio file ID
     */
    private String fileId;
    /**
     * Audio application ID
     */
    private String appId;
    /**
     * Maximum call duration: It will be forced to hang up N seconds after being put through. 1-120 digits or null.
     */
    private Integer maxDuration;
    /**
     * Time of loop count: 1-3, by default: 1. Null is allowed.
     */
    private Integer loopCount;

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

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public Integer getLoopCount() {
        return loopCount;
    }

    public void setLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
    }
}
