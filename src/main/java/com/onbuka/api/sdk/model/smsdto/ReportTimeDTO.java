package com.onbuka.api.sdk.model.smsdto;

/**
 * @author rch
 * @version 1.0.1
 * @createTime 2023/03/11 14:14:59
 * @description reportTimeDTO
 */
public class ReportTimeDTO {


    private String appId;
    private String startTime;
    private String endTime;
    private Integer startIndex = 0;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public String toString() {
        return "?appId=" + appId +"&startTime=" + startTime+"&endTime="+endTime+"&startIndex="+startIndex;
    }
}
