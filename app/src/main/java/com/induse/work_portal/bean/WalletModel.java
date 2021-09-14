package com.induse.work_portal.bean;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WalletModel {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private Response response;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
    public class Response {

        @SerializedName("totalAmount")
        @Expose
        private double totalAmount;

        public String getCouponCode() {
            return couponCode;
        }

        public void setCouponCode(String couponCode) {
            this.couponCode = couponCode;
        }

        public Integer getDiscount() {
            return discount;
        }

        public void setDiscount(Integer discount) {
            this.discount = discount;
        }

        public Boolean getDelete() {
            return isDelete;
        }

        public void setDelete(Boolean delete) {
            isDelete = delete;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getExpire() {
            return expire;
        }

        public void setExpire(String expire) {
            this.expire = expire;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

        @SerializedName("couponCode")
        @Expose
        private String couponCode;
        @SerializedName("discount")
        @Expose
        private Integer discount;
        @SerializedName("isDelete")
        @Expose
        private Boolean isDelete;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("expire")
        @Expose
        private String expire;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("__v")
        @Expose
        private Integer v;




        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

    }
}