package com.onbuka.api.sdk.model.smsdto;


/**
 * @author ruanchuanhui
 * @createTime 2023/3/13
 * @description RecordMoDTO

 */
public class RecordMoDTO {
	
	/**appId*/
	private String appId;
	
	/**current page no*/
	private Integer current;
	
	/** page size*/
	private Integer size;
	
	/**page params*/
	private RecordMoInfoDTO params;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Integer getCurrent() {
		return current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public RecordMoInfoDTO getParams() {
		return params;
	}

	public void setParams(RecordMoInfoDTO params) {
		this.params = params;
	}
}
