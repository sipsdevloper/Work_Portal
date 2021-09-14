package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReasonModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;
    @SerializedName("adminId")
    @Expose
    private String adminId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }


    public class Response {

        @SerializedName("created")
        @Expose
        private Long created;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("__v")
        @Expose
        private Integer v;

        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("senderId")
        @Expose
        private String senderId;
        @SerializedName("reciverId")
        @Expose
        private String reciverId;

        @SerializedName("isRead")
        @Expose
        private Boolean isRead;

        public Boolean getRead() {
            return isRead;
        }

        public void setRead(Boolean read) {
            isRead = read;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getSenderId() {
            return senderId;
        }

        public void setSenderId(String senderId) {
            this.senderId = senderId;
        }

        public String getReciverId() {
            return reciverId;
        }

        public void setReciverId(String reciverId) {
            this.reciverId = reciverId;
        }

        public Long getCreated() {
            return created;
        }

        public void setCreated(Long created) {
            this.created = created;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

    }

}
