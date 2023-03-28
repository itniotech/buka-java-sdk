package com.onbuka.api.sdk.model.otpdto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/15 09:39:15
 * @description FlowDTO
 */
public class FlowDTO {

    private Integer waitingTime;
    private Integer status;
    private String channel;
    private Integer channelCut;


    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getChannelCut() {
        return channelCut;
    }

    public void setChannelCut(Integer channelCut) {
        this.channelCut = channelCut;
    }
}
