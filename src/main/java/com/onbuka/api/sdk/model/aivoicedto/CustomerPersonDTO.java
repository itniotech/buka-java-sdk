package com.onbuka.api.sdk.model.aivoicedto;

import java.util.Map;

/**
 * @author rch
 * @createTime 2023/03/15 15:38:18
 * @description CustomerPersonDTO
 */
public class CustomerPersonDTO {

    private String name;
    private String phoneNumber;
    private String gender;
    private Map properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map getProperties() {
        return properties;
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }
}
