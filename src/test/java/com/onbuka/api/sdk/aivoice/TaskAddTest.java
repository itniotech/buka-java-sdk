package com.onbuka.api.sdk.aivoice;

import com.onbuka.api.sdk.client.AiVoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.aivoicedto.InactiveDateDTO;
import com.onbuka.api.sdk.model.aivoicedto.InactiveTimeDTO;
import com.onbuka.api.sdk.model.aivoicedto.OutboundTaskDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 11:47:26
 * @description TaskAddTest
 */
public class TaskAddTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        AiVoiceSdkClient aiVoiceSdkClient = AiVoiceSdkClient.getInstance(apiData);
        OutboundTaskDTO outboundTaskDTO = new OutboundTaskDTO();
        outboundTaskDTO.setAppId("appId");
        outboundTaskDTO.setName("name");
        outboundTaskDTO.setDialogFlowId(1);
        outboundTaskDTO.setMode("MANUAL");
        outboundTaskDTO.setStartDateTime("startDateTime");
        outboundTaskDTO.setEndDateTime("endDateTime");
        outboundTaskDTO.setDailyStartDateTime("dailyStartDateTime");
        outboundTaskDTO.setDailyEndDateTime("dailyEndDateTime");
        outboundTaskDTO.setRobotCount(1);
        outboundTaskDTO.setJobPhoneNumberId(1);
        List<InactiveTimeDTO> inactiveTimeDTOList = new ArrayList<>();
        List<InactiveDateDTO> inactiveDateDTOList = new ArrayList<>();
        InactiveTimeDTO inactiveTimeDTO = new InactiveTimeDTO();
        inactiveTimeDTO.setStartTime("strTime");
        inactiveTimeDTO.setEndTime("endTime");
        inactiveTimeDTOList.add(inactiveTimeDTO);
        InactiveDateDTO inactiveDateDTO = new InactiveDateDTO();
        inactiveDateDTO.setStartDate("strDate");
        inactiveDateDTO.setEndDate("endDate");
        inactiveDateDTOList.add(inactiveDateDTO);
        List<String> daysOfWeekList = new ArrayList<>();
        daysOfWeekList.add("MONDAY");
        daysOfWeekList.add("TUESDAY");
        List<String> redialConditionList = new ArrayList<>();
        redialConditionList.add("CALL_LOSS");
        redialConditionList.add("NO_ANSWER");
        outboundTaskDTO.setInactiveTimeList(inactiveTimeDTOList);
        outboundTaskDTO.setInactiveDateList(inactiveDateDTOList);
        outboundTaskDTO.setDaysOfWeek(daysOfWeekList);
        outboundTaskDTO.setRedial(false);
        outboundTaskDTO.setRedialCondition(redialConditionList);
        outboundTaskDTO.setRedialInterval(1);
        outboundTaskDTO.setRedialTimes(3);
        String result = aiVoiceSdkClient.taskAdd(outboundTaskDTO);
    }
}
