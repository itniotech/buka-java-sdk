package com.onbuka.api.sdk.resp;

import java.io.Serializable;


/**
 * @author rch
 * @version 1.0.0
 * @description Resp
 * @createTime 2023/3/9 09:04
 */

public class Resp implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * status
      */
    private Integer status = 0;
    /**
     * failed reason
     */
    private String reason;

    public Resp(Integer status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "{" +
                "\"status\":\"" + status.toString() + '\"' +
                ", \"reason\":\"" + reason + '\"' +
                '}';
    }
}
