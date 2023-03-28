package com.onbuka.api.sdk.model.aivoicedto;

import java.util.List;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 15:30:51
 * @description ImportCustomerDTO
 */
public class ImportCustomerDTO extends TaskBaseDTO{


    private Boolean  callRecordDup;
    private List<CustomerPersonDTO> customerPersons;



    public Boolean getCallRecordDup() {
        return callRecordDup;
    }

    public void setCallRecordDup(Boolean callRecordDup) {
        this.callRecordDup = callRecordDup;
    }

    public List<CustomerPersonDTO> getCustomerPersons() {
        return customerPersons;
    }

    public void setCustomerPersons(List<CustomerPersonDTO> customerPersons) {
        this.customerPersons = customerPersons;
    }
}
