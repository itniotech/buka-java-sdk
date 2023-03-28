package com.onbuka.api.sdk.enums;
/**
 * @author ruanchuanhui
 * @createTime 2023/3/10
 * @description SdkCode
 */
public enum SdkCodeEnums {

    ERR(999, "SDK call exception"),
    APPIDISNULLERR(998, "appId is null"),
    TEMPLATEIDISNULLERR(998, "templateId is null"),
    FLOWIDISNULLERR(997, "flowId is null"),
    SUCCESS(1, "SUCCESS");
    private final int code;
    private final String msg;

    private SdkCodeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    /**
     *
     *
     * @param code
     * @return
     */
    public static String getMsg(int code) {
        for (SdkCodeEnums value : SdkCodeEnums.values()) {
            if (value.getCode() == code) {
                return value.getMsg();
            }
        }
        return null;
    }

}