package com.onbuka.api.sdk.model.otpdto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 17:52:39
 * @description BackfillRateDTO
 */
public class BackfillRateDTO {

    private String appId;
    private String mcc;
    private String backfillNumber;
    private String backfillCardinalNumber;
    private String backfillNow;
    private String callbackTime;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getBackfillNumber() {
        return backfillNumber;
    }

    public void setBackfillNumber(String backfillNumber) {
        this.backfillNumber = backfillNumber;
    }

    public String getBackfillCardinalNumber() {
        return backfillCardinalNumber;
    }

    public void setBackfillCardinalNumber(String backfillCardinalNumber) {
        this.backfillCardinalNumber = backfillCardinalNumber;
    }

    public String getBackfillNow() {
        return backfillNow;
    }

    public void setBackfillNow(String backfillNow) {
        this.backfillNow = backfillNow;
    }

    public String getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(String callbackTime) {
        this.callbackTime = callbackTime;
    }
}
