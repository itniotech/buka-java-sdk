package com.onbuka.api.sdk.model.otpdto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 09:39:15
 * @description TemplateDTO
 */
public class TemplateDTO {

    private String templateId;

    /**
     * Application id
     */
    private String appId;
    /**
     * Template name, 4-32 characters, and not allow to duplicate
     */
    private String name;
    /**
     * Template content, 1-256 characters, the template content must contain ##code##
     */
    private String text;
    /**
     *Verification code length [4, 10], default 4
     */
    private Integer codeType;
    /**
     *Verification code length [4, 10], default 4
     */
    private Integer codeLength;
    /**
     *Speech rate [0, 100], default 50
     */
    private Integer speechRate;
    /**
     *Language {
     *     Chinese: CN,
     *     English: EN,
     *     Vietnamese: VN,
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
     * }
     * and it is EN by default
     */
    private String language;
    /**
     *Maximum call duration [5, 599] seconds, and it is 59 seconds by default
     */
    private Integer maxDuration;
    /**
     *Play times [1, 10], and play 1 time by default
     */
    private Integer repeatCnt;
    /**
     *Sender id
     */
    private String senderId;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCodeType() {
        return codeType;
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public Integer getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
    }

    public Integer getSpeechRate() {
        return speechRate;
    }

    public void setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public Integer getRepeatCnt() {
        return repeatCnt;
    }

    public void setRepeatCnt(Integer repeatCnt) {
        this.repeatCnt = repeatCnt;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
