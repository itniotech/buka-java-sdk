package com.onbuka.api.sdk.model.voicedto;

/**
 * @author rch
 * @version 1.0.0
 * @createTime 2023/03/14 14:19:10
 * @description SipResetDTO
 */
public class FileUploadDTO {


    /**
     * File name with suffix, 5-32 characters. Repetition of names is not allowed.
     */
    private String fileName;
    /**
     * File contents of base64 code (For base64 code conversion, please refer to the JAVA sample code at the very bottom of the program.)
     */
    private String file;


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
