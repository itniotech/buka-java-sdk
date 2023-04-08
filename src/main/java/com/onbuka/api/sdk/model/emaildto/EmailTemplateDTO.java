package com.onbuka.api.sdk.model.emaildto;

public class EmailTemplateDTO {

    private String appId;
    private String templateName;
    private Integer templateStatus;
    private String language;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Integer getTemplateStatus() {
        return templateStatus;
    }

    public void setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
