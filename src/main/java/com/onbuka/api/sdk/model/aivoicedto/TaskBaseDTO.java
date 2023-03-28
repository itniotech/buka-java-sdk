package com.onbuka.api.sdk.model.aivoicedto;

/**
 * @author
 * @createTime 2023/03/15 13:47:39
 * @description
 */
public class TaskBaseDTO {

    private String appId;
    private Long jobId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

}
