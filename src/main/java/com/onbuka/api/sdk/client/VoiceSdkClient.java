package com.onbuka.api.sdk.client;


import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.voicedto.*;
import com.onbuka.api.sdk.utils.DataUtil;
import com.onbuka.api.sdk.utils.HttpUtil;
import com.onbuka.api.sdk.utils.JsonUtil;


/**
 * @author rch
 * @createTime 2023/3/15
 * @version 1.0
 * @description VoiceSdkClient
 */
public class VoiceSdkClient implements DefaultSdk{

    volatile public static VoiceSdkClient instance;
    private HttpUtil httpUtil;

    VoiceSdkClient(ApiData apiData){
    this.httpUtil =  getHttpUtil(apiData);
    }

    public static VoiceSdkClient getInstance(ApiData apiData) {
        return new VoiceSdkClient(apiData);
    }

    @Override
    public HttpUtil getHttpUtil(ApiData apiData) {
        return new HttpUtil(apiData);
    }


     /**
      * @author rch
      * @createTime 2023/3/9
      * @description Create phones by batch.
      * @param
      * @return java.lang.String
      */
    public String sipAdd(SipDTO sipDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SIPADD);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sipDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Inquire phones created under a designated audio application.
     * @param
     * @return java.lang.String
     */
    public String sipQuery(QueryDTO sipQueryDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SIPQUERY);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sipQueryDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Reset the phone password of the designated phone account, and return to the new phone password.
     * @param
     * @return java.lang.String
     */
    public String sipReset(SipResetDTO sipResetDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SIPRESET);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sipResetDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description The user can upload an audio file via this API. For sending audio group call, the audio file ID can be used for launching a group call. It supports uploading of files of .mp3 or .wav format.
     * @param
     * @return java.lang.String
     */
    public String fileUpload(FileUploadDTO fileUploadDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.FILEUPLOAD);
        return DataUtil.getResultData(httpUtil.doPost(url, fileUploadDTO.toString()));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Inquire uploaded audio files.
     * @param
     * @return java.lang.String
     */
    public String fileQuery(QueryDTO queryDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.FILEQUERY);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(queryDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Launch an audio group call via uploaded audio file ID.
     * @param
     * @return java.lang.String
     */
    public String sendGroup(SendGroupDTO sendGroupDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SENDGROUP);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sendGroupDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Send audio verification code via designated language and designated language text.
     * @param
     * @return java.lang.String
     */
    public String sendCode(SendCodeDTO sendCodeDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SENDCODE);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sendCodeDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Send audio verification code via designated language and designated language text.
     * @param
     * @return java.lang.String
     */
    public String sendSip(SendSipDTO sipDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SENDSIP);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(sipDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Inquire the record information of a designated phone (for recent two months).
     * @param
     * @return java.lang.String
     */
    public String recordSip(String voiceId) {
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.RECORDSIP);
         url = DataUtil.buildUrl(voiceId, url);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }


    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Inquire phone records by batch on a page basis (for recent two months. The maximum interval between the starting time and the ending time is 31 days).
     * @param
     * @return java.lang.String
     */
    public String recordSipQuery(QueryDTO queryDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.RECORDSIPQUERY);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(queryDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Inquire the recording information of a designated group call or verification code (for recent two months).
     * @param
     * @return java.lang.String
     */
    public String recordGroup(String voiceId) {
         String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.RECORDGROUP);
         url = DataUtil.buildUrl(voiceId, url);
        return DataUtil.getResultData(httpUtil.doGet(url));
    }

    /**
     * @author rch
     * @createTime 2023/3/9
     * @description Inquire phone records by batch on a page basis (for recent two months. The maximum interval between the starting time and the ending time is 31 days).
     * @param
     * @return java.lang.String
     */
    public String recordGroupQuery(QueryDTO queryDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.RECORDGROUPQUERY);
        return DataUtil.getResultData(httpUtil.doPost(url,JsonUtil.toJson(queryDTO)));
    }


}
