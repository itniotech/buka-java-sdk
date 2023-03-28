package com.onbuka.api.sdk.model.aivoicedto;

import java.util.List;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 16:42:37
 * @description UncalledNumberDTO
 */
public class UncalledNumberDTO extends TaskBaseDTO{

    private String name;
    private List<NumberDTO> jobPhoneNumberList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NumberDTO> getJobPhoneNumberList() {
        return jobPhoneNumberList;
    }

    public void setJobPhoneNumberList(List<NumberDTO> jobPhoneNumberList) {
        this.jobPhoneNumberList = jobPhoneNumberList;
    }
}
