package com.onbuka.api.sdk.model.aivoicedto;

import java.util.Map;

/**
 * @author
 * @createTime 2023/03/15 13:47:39
 * @description
 */
public class TaskQueryDTO {

    private Integer current;
    private Integer size;
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
