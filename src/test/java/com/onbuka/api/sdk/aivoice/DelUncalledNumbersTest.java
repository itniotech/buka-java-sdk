package com.onbuka.api.sdk.aivoice;

import com.onbuka.api.sdk.client.AiVoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.aivoicedto.NumberDTO;
import com.onbuka.api.sdk.model.aivoicedto.UncalledNumberDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 16:45:26
 * @description DelUncalledNumbersTest
 */
public class DelUncalledNumbersTest {

    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        AiVoiceSdkClient aiVoiceSdkClient = AiVoiceSdkClient.getInstance(apiData);
        UncalledNumberDTO uncalledNumberDTO = new UncalledNumberDTO();
        uncalledNumberDTO.setAppId("appId");
        uncalledNumberDTO.setJobId(1L);
        uncalledNumberDTO.setName("name");
        List<NumberDTO> numberDTOList = new ArrayList<>();
        NumberDTO numberDTO = new NumberDTO();
        numberDTO.setPhoneNumber("12345678911");
        numberDTO.setName("test");
        numberDTOList.add(numberDTO);
        uncalledNumberDTO.setJobPhoneNumberList(numberDTOList);
        String result = aiVoiceSdkClient.delUncalledNumbers(uncalledNumberDTO);
    }
}
