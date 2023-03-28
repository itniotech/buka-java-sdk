package com.onbuka.api.sdk.model.voicedto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:19:10
 * @description SendCodeDTO
 */
public class SendCodeDTO {


    /**
     * Called number: 7-15 digits composed of national code + mobile phone number.
     */
    private String callee;
    /**
     * Display number: 7-15 digits or null.
     */
    private String displayNum;
    /**
     * Language code
     * [
     *     Vietnamese: VN,
     *     English: EN,
     *     Japanese: JP,
     *     Arabic: ARB
     *     German: DE,
     *     Hindi: IN,
     *     Italian: IT,
     *     Korean: KR,
     *     Russian: RU,
     *     Spanish: ES,
     *     Portuguese: PT,
     *     Indonesian: IDN,
     *     Bangladesh: BD
     * ]
     */
    private String language;
    /**
     * Audio application ID
     */
    private String appId;
    /**
     * The text contents should correspond to the language code(COMMA required between each verification code)
     */
    private String text;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLoopCount() {
        return loopCount;
    }

    public void setLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
    }
}
