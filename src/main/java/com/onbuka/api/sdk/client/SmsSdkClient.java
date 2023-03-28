package com.onbuka.api.sdk.client;

import com.onbuka.api.sdk.enums.ApiEnums;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.smsdto.*;
import com.onbuka.api.sdk.utils.HttpUtil;
import com.onbuka.api.sdk.utils.JsonUtil;
import com.onbuka.api.sdk.utils.DataUtil;

/**
 * @author rch
 * @createTime 2023/3/6 
 * @version 1.0
 * @description SmsSdkClient you can use some sms api method
 */
public class SmsSdkClient implements DefaultSdk{

    volatile public static SmsSdkClient instance;

    private HttpUtil httpUtil;

    SmsSdkClient(ApiData apiData){
    this.httpUtil =  getHttpUtil(apiData);
    }

    public static SmsSdkClient getInstance(ApiData apiData) {
        return new SmsSdkClient(apiData);
    }

    @Override
    public HttpUtil getHttpUtil(ApiData apiData) {
        return new HttpUtil(apiData);
    }




    /**
     * @author ruanchuanhui
     * @createTime 2023/3/9
     * @description The protocol is used to send SMS, supporting single number or multiple numbers, Support GET or POST, GET can support 100 numbers once, POST can support 1000 numbers once.
     * @param sendSmsDto
     * @return java.lang.String
     */
    public String sendSmsV3(SendSmsDTO sendSmsDto) {
        return DataUtil.getResultData(httpUtil.doPost(DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.SENDSMS),JsonUtil.toJson(sendSmsDto)));
    }



    /**
     * @author: ruanchuanhui
     * @createTime: 2023/3/10
     * @description: The protocol is used to query the submission result of specific msgId array(From beginning time to ending time, only the SMS records of the last 90-120 days can be queried)
     * @param: reportDto
     * @return: java.lang.String
     */
    public String getReport(ReportDTO reportDto){
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.GETREPORT).concat(reportDto.toString());
        return DataUtil.getResultData(httpUtil.doGet(url));
    }
    
    /**
     * @author ruanchuanhui 
     * @createTime 2023/3/11
     * @description The protocol is used to get SMS report by time slot(Support the query of SMS records in the last 90 days, with the maximum query time interval of 31 days).
     * @param: reportTimeDTO
     * @return: java.lang.String
     */
    public String getSentRcd(ReportTimeDTO reportTimeDTO){
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.GETSENTRCD).concat(reportTimeDTO.toString());
        return DataUtil.getResultData(httpUtil.doGet(url));
    }

    /**
     * @author ruanchuanhui
     * @createTime 2023/3/9
     * @description The protocol is used to send SMS, supporting single number or multiple numbers, Support GET or POST, GET can support 100 numbers once, POST can support 1000 numbers once.
     * @param batchSendContentSmsDTO
     * @return java.lang.String
     */
    public String batchSendSms(BatchSendContentSmsDTO batchSendContentSmsDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.BATCHSENDSMS);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(batchSendContentSmsDTO)));
    }

    /**
     * @author ruanchuanhui
     * @createTime 2023/3/9
     * @description Query the user specified interval reply message, the biggest query time interval for a month, the minimum starting time for the 2022-07-01 T00:00:00 + 08:00.
     * @param recordMoDTO
     * @param httpUtil.getBaseUrl() apiUrl
     * @return java.lang.String
     */
    public String recordMo(RecordMoDTO recordMoDTO) {
        final String url = DataUtil.getApi(httpUtil.getBaseUrl(), ApiEnums.RECORDMO);
        return DataUtil.getResultData(httpUtil.doPost(url, JsonUtil.toJson(recordMoDTO)));
    }







}
