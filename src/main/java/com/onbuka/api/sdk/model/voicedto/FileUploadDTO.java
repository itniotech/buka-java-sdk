package com.onbuka.api.sdk.model.voicedto;

import com.onbuka.api.sdk.utils.DataUtil;

import java.io.File;
import java.util.Base64;

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

    private File originalFile;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFile() {
        if (null != getOriginalFile() || 0 == getOriginalFile().length()){
            this.file = DataUtil.file2Base64(getOriginalFile());
        }
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public File getOriginalFile() {
        return originalFile;
    }

    public void setOriginalFile(File originalFile) {
        this.originalFile = originalFile;
    }

    @Override
    public String toString() {
        return "{" +
                "\"fileName\":\"" + fileName + '\"' +
                ", \"file\":\"" + getFile() + '\"' +
                '}';
    }

    public static void main(String[] args) {
        FileUploadDTO fileUploadDTO = new FileUploadDTO();
        fileUploadDTO.setFileName("test");
        fileUploadDTO.setOriginalFile(new File("D:\\11582.mp3"));
        System.out.printf(fileUploadDTO.toString());
    }
}
