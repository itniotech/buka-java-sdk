package com.onbuka.api.sdk.enums;
/**
 * @author ruanchuanhui
 * @createTime 2023/3/10
 * @description SdkCode
 */
public enum ApiEnums {

    /////////////////USER////////////////////////
    GETBALANCE( "getBalance"),


    /////////////////SMS////////////////////////
    SENDSMS( "sendSms"),
    GETREPORT("getReport"),
    GETSENTRCD("getSentRcd"),
    BATCHSENDSMS("sendSms/batch"),
    RECORDMO("recordMo"),


    /////////////////EMAIL////////////////////////
    SENDEMAIL("email/sendEmail"),
    BATCHSENDEMAIL("email/batchSendEmail"),
    GETSENDEMAILRCD("email/getSendEmailRcd"),
    GETLISTEMAILTEMPLATES("email/getListEmailTemplates"),
    GETLISTRECEIVERS("email/getListReceivers"),
    GETLISTEMAILADDRESS("email/getListEmailAddress"),


    /////////////////VOICE////////////////////////
    SIPADD("voice/sipAdd"),
    SIPQUERY("voice/sipQuery"),
    SIPRESET("voice/sipReset"),
    FILEUPLOAD("voice/fileUpload"),
    FILEQUERY("voice/fileQuery"),
    SENDGROUP("voice/sendGroup"),
    SENDCODE("voice/sendCode"),
    SENDSIP("voice/sendSip"),
    RECORDSIP("voice/recordSip/"),
    RECORDSIPQUERY("voice/recordSipQuery"),
    RECORDGROUP("voice/recordGroup/"),
    RECORDGROUPQUERY("voice/recordGroupQuery"),


    /////////////////OTP////////////////////////
    APPADD("otp/app/add"),
    APPUPDATE("otp/app/update/"),
    APPDETAILS("otp/app/details/"),
    TEMPLATEADD("otp/template/add"),
    TEMPLATEUPDATE("otp/template/update/"),
    TEMPLATEDETAILS("otp/template/details/"),
    TEMPLATELIST("otp/template/list"),
    VERIFICATIONSEND("otp/verification/send"),
    VERIFICATIONRESEND("otp/verification/resend"),
    VERIFICATIONVERIFY("otp/verification/verify"),
    VERIFICATIONRECORD("otp/verification/record/"),
    FLOWADD("otp/flow/add"),
    FLOWUPDATE("otp/flow/update/"),
    FLOWDETAILS("otp/flow/details/"),
    FLOWDLIST("otp/flow/list"),
    VERIFICATIONORDERRECORD("otp/verification/orderId/record"),
    VERIFICATIONSENDRULE("otp/verification/sendRule"),
    BACKFILLRATE("otp/backfillRate"),


    /////////////////AIVOICE////////////////////////
    DIALOGFLOWLIST("AiVoice/dialogFlowList"),
    CHANNELLIST("AiVoice/channelList"),
    TASKADD("AiVoice/taskAdd"),
    TASKEDIT("AiVoice/taskEdit"),
    QUERYTASKVARIABLE("AiVoice/properties"),
    IMPORTCUSTOMER("AiVoice/importCustomer"),
    TASKSTART("AiVoice/taskStart"),
    TASKSTOP("AiVoice/taskStop"),
    TASKDEL("AiVoice/taskDel"),
    TASKLIST("AiVoice/taskList"),
    TASKNOCALL("AiVoice/taskNoCall"),
    DELUNCALLEDNUMBERS("AiVoice/importCustomer/del"),
    RECORDQUERY("AiVoice/recordQuery"),



    /////////////////BASEURL////////////////////////

    BASEURL("https://api.onbuka.com/v3/");
    private final String url;

    private ApiEnums(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    /**
     *
     *
     * @param name
     * @return
     */
    public static String getUrl(String name) {
        for (ApiEnums value : ApiEnums.values()) {
            if (value.name() == name) {
                return value.getUrl();
            }
        }
        return null;
    }

}