package com.onbuka.api.sdk.aivoice;

import com.onbuka.api.sdk.client.AiVoiceSdkClient;
import com.onbuka.api.sdk.model.ApiData;
import com.onbuka.api.sdk.model.aivoicedto.CustomerPersonDTO;
import com.onbuka.api.sdk.model.aivoicedto.ImportCustomerDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 11:47:26
 * @description ImportCustomerTest
 */
public class ImportCustomerTest {
    public static void main(String[] args) {
        ApiData apiData = new ApiData("key","secret");
        AiVoiceSdkClient aiVoiceSdkClient = AiVoiceSdkClient.getInstance(apiData);
        ImportCustomerDTO importCustomerDTO = new ImportCustomerDTO();
        importCustomerDTO.setAppId("appId");
        importCustomerDTO.setJobId(1L);
        importCustomerDTO.setCallRecordDup(true);
        List<CustomerPersonDTO> customerPersonDTOList = new ArrayList<>();
        CustomerPersonDTO customerPersonDTO = new CustomerPersonDTO();
        customerPersonDTO.setName("name");
        customerPersonDTO.setGender("gender");
        Map propertiesMap = new HashMap<>();
        propertiesMap.put("income","10");
        propertiesMap.put("The last four digit numbers of the certificates","0235");
        propertiesMap.put("Relationship with self","Friendship");
        propertiesMap.put("Purpose of loan","buy a house");
        propertiesMap.put("Job name","a");
        propertiesMap.put("Address of residence","abc");
        propertiesMap.put("Certificate type","123");
        propertiesMap.put("Marital status","unmarried");
        customerPersonDTO.setProperties(propertiesMap);
        customerPersonDTOList.add(customerPersonDTO);
        importCustomerDTO.setCustomerPersons(customerPersonDTOList);
        String result = aiVoiceSdkClient.importCustomer(importCustomerDTO);
    }
}
