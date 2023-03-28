package com.onbuka.api.sdk.client;


import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.enums.SdkCodeEnums;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.otpdto.*;
import com.onbuka.api.sdk.resp.Resp;
import com.onbuka.api.sdk.utils.DataUtil;
import com.onbuka.api.sdk.utils.HttpUtil;
import com.onbuka.api.sdk.utils.JsonUtil;

/**
 * @author rch
 * @createTime 2023/3/15
 * @version 1.0
 * @description OtpSdkClient
 */
public class OtpSdkClient implements DefaultSdk{

    volatile public static OtpSdkClient instance;
    private HttpUtil httpUtil;

    OtpSdkClient(ApiData apiData){
    this.httpUtil =  getHttpUtil(apiData);
    }

    public static OtpSdkClient getInstance(ApiData apiData) {
        return new OtpSdkClient(apiData);
    }

    @Override
    public HttpUtil getHttpUtil(ApiData apiData) {
        return new HttpUtil(apiData);
    }


     /**
      * @author rch
      * @createTime 2023/3/15
      * @description Create the verification code application through the API.
      * @param
      * @return java.lang.String
      */
    public String appAdd(VerificationCodeDTO verificationCodeDTO ) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.APPADD);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(verificationCodeDTO)));
    }

     /**
      * @author rch
      * @createTime 2023/3/15
      * @description Create the verification code application through the API.
      * @param
      * @return java.lang.String
      */
    public String appUpdate(VerificationCodeDTO verificationCodeDTO ) {
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.APPUPDATE);
        if(verificationCodeDTO.getAppId()== "" || verificationCodeDTO.getAppId() == null){
            return new Resp(SdkCodeEnums.APPIDISNULLERR.getCode(), SdkCodeEnums.APPIDISNULLERR.getMsg()).toString();
        }
        if(url.lastIndexOf(verificationCodeDTO.getAppId())==-1){
            url = DataUtil.buildUrl(verificationCodeDTO.getAppId(), url);
        }
        return DataUtil.getResultData(httpUtil.doPut(url, JsonUtil.toJson(verificationCodeDTO)));
    }

     /**
      * @author rch
      * @createTime 2023/3/15
      * @description  Obtain the application details of the specified verification code through the API.
      * @param
      * @return java.lang.String
      */
    public String appDetails(String appId) {
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.APPDETAILS);
         url = DataUtil.buildUrl(appId, url);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }


    /**
     * @author rch
     * @createTime 2023/3/15
     * @description Create a verification code template through the API.
     * @param
     * @return java.lang.String
     */
    public String templateAdd(TemplateDTO templateDTO ) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TEMPLATEADD);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(templateDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Update verification code template information through the API.
     * @param
     * @return java.lang.String
     */
    public String templateUpdate(TemplateDTO templateDTO) {
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TEMPLATEUPDATE);
        if(templateDTO.getTemplateId()== "" || templateDTO.getTemplateId() == null){
            return new Resp(SdkCodeEnums.TEMPLATEIDISNULLERR.getCode(), SdkCodeEnums.TEMPLATEIDISNULLERR.getMsg()).toString();
        }
        url = DataUtil.buildUrl(templateDTO.getTemplateId(), url);
        return DataUtil.getResultData(httpUtil.doPut(url, JsonUtil.toJson(templateDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Obtain the details of the specified verification code template through the API.
     * @param
     * @return java.lang.String
     */
    public String templateDetails(Integer templateId) {
        if(templateId==null){
            return new Resp(SdkCodeEnums.TEMPLATEIDISNULLERR.getCode(), SdkCodeEnums.TEMPLATEIDISNULLERR.getMsg()).toString();
        }
        String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TEMPLATEDETAILS);

         url = DataUtil.buildUrl(String.valueOf(templateId), url);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }


    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Obtain all verification code templates under the current user.
     * @param
     * @return java.lang.String
     */
    public String templateList() {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TEMPLATELIST);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }


    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Send SMS verification code through the API.
     * @param
     * @return java.lang.String
     */
    public String verificationSend(VerificationDTO verificationDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.VERIFICATIONSEND);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(verificationDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Resend the specified message id verification code through the API, and return the new message id.
     * @param
     * @return java.lang.String
     */
    public String verificationResend(VerificationResendDTO verificationResendDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.VERIFICATIONRESEND);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(verificationResendDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Check whether the verification code of the specified message id is correct through the API.
     * @param
     * @return java.lang.String
     */
    public String verificationVerify(VerifyDTO verifyDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.VERIFICATIONVERIFY);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(verifyDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Query the details of the specified message id record through the API.
     * @param
     * @return java.lang.String
     */
    public String verificationRecord(String verificationId) {
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.VERIFICATIONRECORD);
         url = DataUtil.buildUrl(verificationId, url);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }


    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Create a task flow through the interface.
     * @param
     * @return java.lang.String
     */
    public String flowAdd(TaskFlowDTO taskFlowDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.FLOWADD);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(taskFlowDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Updates the task flow through the interface.
     * @param
     * @return java.lang.String
     */
    public String flowUpdate(TaskFlowDTO taskFlowDTO) {
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.FLOWUPDATE);
        if(taskFlowDTO.getFlowId()== "" || taskFlowDTO.getFlowId() == null){
            return new Resp(SdkCodeEnums.FLOWIDISNULLERR.getCode(), SdkCodeEnums.FLOWIDISNULLERR.getMsg()).toString();
        }
        url = DataUtil.buildUrl(taskFlowDTO.getFlowId(), url);
        return DataUtil.getResultData(httpUtil.doPut(url, JsonUtil.toJson(taskFlowDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Get the details of the specified task flow through the interface.
     * @param
     * @return java.lang.String
     */
    public String flowDetails(String flowId) {
        if(flowId== "" || flowId== null){
            return new Resp(SdkCodeEnums.FLOWIDISNULLERR.getCode(), SdkCodeEnums.FLOWIDISNULLERR.getMsg()).toString();
        }
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.FLOWDETAILS);
         url = DataUtil.buildUrl(flowId, url);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Get all task streams under the current user.
     * @param
     * @return java.lang.String
     */
    public String flowList() {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.FLOWDLIST);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }


    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Query sending records by running number.
     * @param
     * @return java.lang.String
     */
    public String verificationOrderRecord(VerificationOrderRecordDTO verificationOrderRecordDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.VERIFICATIONORDERRECORD);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(verificationOrderRecordDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Send Routine OTP.
     * @param
     * @return java.lang.String
     */
    public String verificationSendRule(VerificationSendRuleDTO verificationSendRuleDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.VERIFICATIONSENDRULE);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(verificationSendRuleDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/15
     * @description  Backfill Rate Callback.
     * @param
     * @return java.lang.String
     */
    public String backfillRate(BackfillRateDTO backfillRateDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.BACKFILLRATE);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(backfillRateDTO)));
    }

}
