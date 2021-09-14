package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChatAdminModel {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

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

    public class Response {

        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("isRead")
        @Expose
        private Boolean isRead;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("senderId")
        @Expose
        private String senderId;
        @SerializedName("reciverId")
        @Expose
        private String reciverId;
        @SerializedName("__v")
        @Expose
        private Integer v;

        public Boolean getMy_text() {
            return my_text;
        }

        public void setMy_text(Boolean my_text) {
            this.my_text = my_text;
        }

        @SerializedName("my_text")
        @Expose
        private Boolean my_text;
        @SerializedName("created")
        @Expose
        private Long created;

        public Long getCreated() {
            return created;
        }

        public void setCreated(Long created) {
            this.created = created;
        }

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

        public Boolean getIsRead() {
            return isRead;
        }

        public void setIsRead(Boolean isRead) {
            this.isRead = isRead;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

    }
}
