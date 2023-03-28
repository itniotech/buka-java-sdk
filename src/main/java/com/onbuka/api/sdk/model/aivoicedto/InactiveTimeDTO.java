package com.onbuka.api.sdk.model.aivoicedto;

/**
 * @author
 * @createTime 2023/03/15 13:46:37
 * @description
 */
public class InactiveTimeDTO {
    private String startTime;
    private String endTime;

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
}
