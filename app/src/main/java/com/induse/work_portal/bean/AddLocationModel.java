package com.induse.work_portal.bean;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddLocationModel {


    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private Response response;

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

        @SerializedName("latLong")
        @Expose
        private LatLong latLong;
        @SerializedName("addressLine1")
        @Expose
        private String addressLine1;
        @SerializedName("addressLine2")
        @Expose
        private String addressLine2;
        @SerializedName("zipCode")
        @Expose
        private Integer zipCode;
        @SerializedName("userId")
        @Expose
        private String userId;
        @SerializedName("area")
        @Expose
        private String area;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("createdAt")
        @Expose
        private Long createdAt;
        @SerializedName("updatedAt")
        @Expose
        private Long updatedAt;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("__v")
        @Expose
        private Integer v;

        public LatLong getLatLong() {
            return latLong;
        }

        public void setLatLong(LatLong latLong) {
            this.latLong = latLong;
        }

        public String getAddressLine1() {
            return addressLine1;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public String getAddressLine2() {
            return addressLine2;
        }

        public void setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public Integer getZipCode() {
            return zipCode;
        }

        public void setZipCode(Integer zipCode) {
            this.zipCode = zipCode;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

        public class LatLong {

            @SerializedName("type")
            @Expose
            private String type;
            @SerializedName("coordinates")
            @Expose
            private List<Double> coordinates = null;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<Double> getCoordinates() {
                return coordinates;
            }

            public void setCoordinates(List<Double> coordinates) {
                this.coordinates = coordinates;
            }

        }

    }

}
