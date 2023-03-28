package com.onbuka.api.sdk.client;


import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.enums.SdkCodeEnums;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.emaildto.*;
import com.onbuka.api.sdk.resp.Resp;
import com.onbuka.api.sdk.utils.DataUtil;
import com.onbuka.api.sdk.utils.HttpUtil;
import com.onbuka.api.sdk.utils.JsonUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ruanchuanhui
 * @createTime 2023/3/14
 * @description EmailSdkClient

 */
public class EmailSdkClient implements DefaultSdk{

    volatile public static EmailSdkClient instance;
    private HttpUtil httpUtil;

    EmailSdkClient(ApiData apiData){
    this.httpUtil =  getHttpUtil(apiData);
    }

    public static EmailSdkClient getInstance(ApiData apiData) {
        return new EmailSdkClient(apiData);
    }

    @Override
    public HttpUtil getHttpUtil(ApiData apiData) {
        return new HttpUtil(apiData);
    }


 /**
  * @author rch
  * @createTime 2023/3/9
  * @description  You can send HTML or TEXT email via this API for trigger type email (CAPTCHA, transaction type).
  * @param sendEmailDTO
  * @param httpUtil.getBaseUrl()
  * @return java.lang.String
  */
    public String sendEmail(SendEmailDTO sendEmailDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SENDEMAIL);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sendEmailDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description  You can send TEXT or HTML email in bulk through this API, which is suitable for marketing and notification email. Before sending bulk email, you need to create recipient list, Mail address and email template.
     * @param
     * @return java.lang.String
     */
    public String batchSendEmail(BatchSendEmailDTO batchSendEmailDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.BATCHSENDEMAIL);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(batchSendEmailDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description  Query the delivery results of the specified emailId set.
     * @param
     * @return java.lang.String
     */
    public String getSendEmailRcd(SendEmailRcdDTO sendEmailRcdDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.GETSENDEMAILRCD);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sendEmailRcdDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/23
     * @description  getListEmailTemplates
     * @param
     * @return java.lang.String
     */
    public String getListEmailTemplates(EmailTemplateDTO templateDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.GETLISTEMAILTEMPLATES);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(templateDTO)));
    }

 /**
     * @author rch
     * @createTime 2023/3/23
     * @description  getListReceivers
     * @param
     * @return java.lang.String
     */
    public String getListReceivers(EmailReceiverDTO receiverDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.GETLISTRECEIVERS);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(receiverDTO)));
    }

/**
     * @author rch
     * @createTime 2023/3/23
     * @description  getListEmailAddress
     * @param
     * @return java.lang.String
     */
    public String getListEmailAddress(String appId) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.GETLISTEMAILADDRESS);
        if(appId== "" || appId== null){
            return new Resp(SdkCodeEnums.APPIDISNULLERR.getCode(), SdkCodeEnums.APPIDISNULLERR.getMsg()).toString();
        }
        Map params = new HashMap<>();
        params.put("appId",appId);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(params)));
    }





}
