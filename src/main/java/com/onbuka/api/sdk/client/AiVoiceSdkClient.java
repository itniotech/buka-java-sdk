package com.onbuka.api.sdk.client;


import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.enums.SdkCodeEnums;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.aivoicedto.*;
import com.onbuka.api.sdk.resp.Resp;
import com.onbuka.api.sdk.utils.DataUtil;
import com.onbuka.api.sdk.utils.HttpUtil;
import com.onbuka.api.sdk.utils.JsonUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rch
 * @createTime 2023/3/16
 * @version 1.0
 * @description AiVoiceSdkClient
 */
public class AiVoiceSdkClient implements DefaultSdk{

    volatile public static AiVoiceSdkClient instance;
    private HttpUtil httpUtil;

    AiVoiceSdkClient(ApiData apiData){
    this.httpUtil =  getHttpUtil(apiData);
    }

    public static AiVoiceSdkClient getInstance(ApiData apiData) {
        return new AiVoiceSdkClient(apiData);
    }

    @Override
    public HttpUtil getHttpUtil(ApiData apiData) {
        return new HttpUtil(apiData);
    }


 /**
  * @author rch
  * @createTime 2023/3/16
  * @description Query Script List
  * @param
  * @return java.lang.String
  */
    public String dialogFlowList(String appId) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(),ApiEnums.DIALOGFLOWLIST);
        if(appId == "" || appId == null){
            return new Resp(SdkCodeEnums.APPIDISNULLERR.getCode(), SdkCodeEnums.APPIDISNULLERR.getMsg()).toString();
        }
        Map parmaMap = new HashMap<>(1);
        parmaMap.put("appId",appId);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(parmaMap)));
    }

    /**
     * @author rch
     * @createTime 2023/3/16
     * @description Query the list of available outbound lines.
     * @param
     * @return java.lang.String
     */
    public String channelList(String appId) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(),ApiEnums.CHANNELLIST);
        Map parmaMap = new HashMap<>(1);
        parmaMap.put("appId",appId);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(parmaMap)));
    }

    /**
     * @author rch
     * @createTime 2023/3/16
     * @description Create AI Outbound Task.
     * @param
     * @return java.lang.String
     */
    public String taskAdd(OutboundTaskDTO outboundTaskDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(),ApiEnums.TASKADD);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(outboundTaskDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/16
     * @description Create AI Outbound Task.
     * @param
     * @return java.lang.String
     */
    public String taskEdit(OutboundTaskDTO outboundTaskDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TASKEDIT);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(outboundTaskDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/16
     * @description Query task variable.
     * @param
     * @return java.lang.String
     */
    public String queryTaskVariable(TaskBaseDTO queryVariableDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.QUERYTASKVARIABLE);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(queryVariableDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/16
     * @description Import Customers to Task
     * @param
     * @return java.lang.String
     */
    public String importCustomer(ImportCustomerDTO importCustomerDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.IMPORTCUSTOMER);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(importCustomerDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/16
     * @description  Open task.
     * @param
     * @return java.lang.String
     */
    public String taskStart(TaskBaseDTO taskBaseDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TASKSTART);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(taskBaseDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/16
     * @description  Pause task.
     * @param
     * @return java.lang.String
     */
    public String taskStop(TaskBaseDTO taskBaseDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TASKSTOP);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(taskBaseDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/16
     * @description  Delete task.
     * @param
     * @return java.lang.String
     */
    public String taskDel(TaskBaseDTO taskBaseDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TASKDEL);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(taskBaseDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/16
     * @description   Query task list.
     * @param
     * @return java.lang.String
     */
    public String taskList(TaskQueryDTO taskQueryDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TASKLIST);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(taskQueryDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/16
     * @description   Query task list.
     * @param
     * @return java.lang.String
     */
    public String taskNoCall(TaskQueryDTO taskQueryDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.TASKNOCALL);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(taskQueryDTO)));
    }


    /**
     * @author rch
     * @createTime 2023/3/16
     * @description  Delete Uncalled Numbers From a Task.
     * @param
     * @return java.lang.String
     */
    public String delUncalledNumbers(UncalledNumberDTO uncalledNumberDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.DELUNCALLEDNUMBERS);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(uncalledNumberDTO)));
    }

    /**
     * @author rch
     * @createTime 2023/3/16
     * @description  Query call records in time period.
     * @param
     * @return java.lang.String
     */
    public String recordQuery(TaskQueryDTO taskQueryDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.RECORDQUERY);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(taskQueryDTO)));
    }
}
