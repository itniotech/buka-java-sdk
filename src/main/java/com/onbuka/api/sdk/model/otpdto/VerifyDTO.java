package com.onbuka.api.sdk.model.otpdto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 17:52:39
 * @description VerifyDTO
 */
public class VerifyDTO {

    private String verificationId;

    private String code;


    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
