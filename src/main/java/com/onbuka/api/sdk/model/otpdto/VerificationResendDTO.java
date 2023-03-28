package com.onbuka.api.sdk.model.otpdto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 17:52:39
 * @description VerificationDTO
 */
public class VerificationResendDTO {

    private String verificationId;
    private String channel;

    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
