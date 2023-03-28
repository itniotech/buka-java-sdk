package com.onbuka.api.sdk.model.voicedto;

import java.util.Map;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:19:10
 * @description SipQueryDTO
 */
public class QueryDTO {


    /**
     * Current page number: 1-N
     */
    private Integer current;
    /**
     * Number displayed on each page: 1-100
     */
    private Integer size;

    /**
     * Audio application ID
     */
    private Map params;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Map getParams() {
        return params;
    }

    public void setParams(Map params) {
        this.params = params;
    }
}
