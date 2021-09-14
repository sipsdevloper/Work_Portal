package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCouponResponse {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;
    private List<Data> data= null;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }


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

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public class Response {

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
        @SerializedName("__v")
        @Expose
        private Integer v;
        @SerializedName("image")
        @Expose
        private String image;

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

        public Boolean getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(Boolean isDelete) {
            this.isDelete = isDelete;
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

        public String getExpire() {
            return expire;
        }

        public void setExpire(String expire) {
            this.expire = expire;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }


    }

    public class Data {

        @SerializedName("set_threshold_radius")
        @Expose
        private String set_threshold_radius;
        @SerializedName("set_threshold_charge")
        @Expose
        private String set_threshold_charge;
        @SerializedName("set_charge_per_km")
        @Expose
        private String set_charge_per_km;
        @SerializedName("_id")
        @Expose
        private String _id;
        @SerializedName("vat")
        @Expose
        private String vat;
        @SerializedName("cancel_fee")
        @Expose
        private String cancel_fee;
        @SerializedName("secure_delivery_cost")
        @Expose
        private String secure_delivery_cost;
        @SerializedName("fast_delivery_cost")
        @Expose
        private String fast_delivery_cost;

        public String getSet_threshold_radius() {
            return set_threshold_radius;
        }

        public void setSet_threshold_radius(String set_threshold_radius) {
            this.set_threshold_radius = set_threshold_radius;
        }

        public String getSet_threshold_charge() {
            return set_threshold_charge;
        }

        public void setSet_threshold_charge(String set_threshold_charge) {
            this.set_threshold_charge = set_threshold_charge;
        }

        public String getSet_charge_per_km() {
            return set_charge_per_km;
        }

        public void setSet_charge_per_km(String set_charge_per_km) {
            this.set_charge_per_km = set_charge_per_km;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getVat() {
            return vat;
        }

        public void setVat(String vat) {
            this.vat = vat;
        }

        public String getCancel_fee() {
            return cancel_fee;
        }

        public void setCancel_fee(String cancel_fee) {
            this.cancel_fee = cancel_fee;
        }

        public String getSecure_delivery_cost() {
            return secure_delivery_cost;
        }

        public void setSecure_delivery_cost(String secure_delivery_cost) {
            this.secure_delivery_cost = secure_delivery_cost;
        }

        public String getFast_delivery_cost() {
            return fast_delivery_cost;
        }

        public void setFast_delivery_cost(String fast_delivery_cost) {
            this.fast_delivery_cost = fast_delivery_cost;
        }
    }

}
