package com.onbuka.api.sdk.model.voicedto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 16:42:48
 * @description SipParamsDTO
 */
public class ParamsDTO {

    /**
     * Starting time of inquiry: ISO8601 standard time format 2022-01-01T00:00:00+08:00
     */
    private String strTime;
    /**
     * Ending time of inquiry: ISO8601 standard time format 2022-01-31T00:00:00+08:00
     */
    private String endTime;
    /**
     * Name of phone group, exact match
     */
    private String sipGroupName;
    /**
     * Phone name, exact match
     */
    private String phoneName;



    public ParamsDTO(String strTime, String endTime, String sipGroupName, String phoneName) {
        this.strTime = strTime;
        this.endTime = endTime;
        this.sipGroupName = sipGroupName;
        this.phoneName = phoneName;
    }

    public ParamsDTO(String strTime, String endTime) {
        this.strTime = strTime;
        this.endTime = endTime;
    }

    public String getStrTime() {
        return strTime;
    }

    public void setStrTime(String strTime) {
        this.strTime = strTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSipGroupName() {
        return sipGroupName;
    }

    public void setSipGroupName(String sipGroupName) {
        this.sipGroupName = sipGroupName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
}
