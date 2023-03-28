package com.onbuka.api.sdk.model.aivoicedto;

import com.onbuka.api.sdk.utils.JsonUtil;

import java.util.List;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 12:01:03
 * @description
 */
public class OutboundTaskDTO extends TaskBaseDTO{


    private String name;
    private Integer dialogFlowId;
    private String mode;
    private String startDateTime;
    private String endDateTime;
    private String dailyStartDateTime;
    private String dailyEndDateTime;
    private Integer robotCount;
    private Integer jobPhoneNumberId;
    private List<InactiveTimeDTO> inactiveTimeList;
    private List<InactiveDateDTO> inactiveDateList;
    private List<String> daysOfWeek;
    private Boolean redial;
    private List<String> redialCondition;
    private Integer redialInterval;
    private Integer redialTimes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDialogFlowId() {
        return dialogFlowId;
    }

    public void setDialogFlowId(Integer dialogFlowId) {
        this.dialogFlowId = dialogFlowId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getDailyStartDateTime() {
        return dailyStartDateTime;
    }

    public void setDailyStartDateTime(String dailyStartDateTime) {
        this.dailyStartDateTime = dailyStartDateTime;
    }

    public String getDailyEndDateTime() {
        return dailyEndDateTime;
    }

    public void setDailyEndDateTime(String dailyEndDateTime) {
        this.dailyEndDateTime = dailyEndDateTime;
    }

    public Integer getRobotCount() {
        return robotCount;
    }

    public void setRobotCount(Integer robotCount) {
        this.robotCount = robotCount;
    }

    public Integer getJobPhoneNumberId() {
        return jobPhoneNumberId;
    }

    public void setJobPhoneNumberId(Integer jobPhoneNumberId) {
        this.jobPhoneNumberId = jobPhoneNumberId;
    }

    public List<InactiveTimeDTO> getInactiveTimeList() {
        return inactiveTimeList;
    }

    public void setInactiveTimeList(List<InactiveTimeDTO> inactiveTimeList) {
        this.inactiveTimeList = inactiveTimeList;
    }

    public List<InactiveDateDTO> getInactiveDateList() {
        return inactiveDateList;
    }

    public void setInactiveDateList(List<InactiveDateDTO> inactiveDateList) {
        this.inactiveDateList = inactiveDateList;
    }

    public List<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<String> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public Boolean getRedial() {
        return redial;
    }

    public void setRedial(Boolean redial) {
        this.redial = redial;
    }

    public List<String> getRedialCondition() {
        return redialCondition;
    }

    public void setRedialCondition(List<String> redialCondition) {
        this.redialCondition = redialCondition;
    }

    public Integer getRedialInterval() {
        return redialInterval;
    }

    public void setRedialInterval(Integer redialInterval) {
        this.redialInterval = redialInterval;
    }

    public Integer getRedialTimes() {
        return redialTimes;
    }

    public void setRedialTimes(Integer redialTimes) {
        this.redialTimes = redialTimes;
    }
}
