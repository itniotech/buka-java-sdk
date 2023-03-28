package com.onbuka.api.sdk.model.otpdto;

import java.util.List;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 09:39:15
 * @description TaskFlowDTO
 */
public class TaskFlowDTO {

    private String flowId;
    private String name;
    private List<FlowDTO> flowDTOList;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FlowDTO> getFlowDTOList() {
        return flowDTOList;
    }

    public void setFlowDTOList(List<FlowDTO> flowDTOList) {
        this.flowDTOList = flowDTOList;
    }
}
