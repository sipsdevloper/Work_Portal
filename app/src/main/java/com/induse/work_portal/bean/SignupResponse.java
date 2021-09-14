package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignupResponse {

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("ResponseData")
    @Expose
    private ResponseData responseData;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("StatusCode")
    @Expose
    private String statusCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public class ResponseData {

        @SerializedName("FileName")
        @Expose
        private String fileName;
        @SerializedName("FilePath")
        @Expose
        private String filePath;
        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("ReferenceId")
        @Expose
        private String referenceId;

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getReferenceId() {
            return referenceId;
        }

        public void setReferenceId(String referenceId) {
            this.referenceId = referenceId;
        }

    }
}
