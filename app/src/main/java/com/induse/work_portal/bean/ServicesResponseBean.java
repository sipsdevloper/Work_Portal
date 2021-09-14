package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServicesResponseBean {
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;



    @SerializedName("response")
    @Expose
    private  ResponseBean response;
    public ResponseBean getResponse() {
        return response;
    }

    public  void setResponse(ResponseBean response) {
        this.response = response;
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


    public class ResponseBean {

        public Float getAvg_rating() {
            return avg_rating;
        }

        public void setAvg_rating(Float avg_rating) {
            this.avg_rating = avg_rating;
        }

        @SerializedName("avg_rating")
        @Expose
        private Float avg_rating;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("countryCode")
        @Expose
        private String countryCode;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("shopName")
        @Expose
        private String shopName;
        @SerializedName("otp")
        @Expose
        private String otp;
        @SerializedName("created")
        @Expose
        private String created;
        @SerializedName("updated")
        @Expose
        private String updated;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("is_otp_verified")
        @Expose
        private Boolean isOtpVerified;
        @SerializedName("isDelete")
        @Expose
        private Boolean isDelete;
        @SerializedName("accountCode")
        @Expose
        private String accountCode;
        @SerializedName("profileImage")
        @Expose
        private String profileImage;
        @SerializedName("deviceToken")
        @Expose
        private String deviceToken;
        @SerializedName("deviceType")
        @Expose
        private Integer deviceType;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("__v")
        @Expose
        private Integer v;
        @SerializedName("token")
        @Expose
        private String token;
        @SerializedName("userId")
        @Expose
        private String userId;

        @SerializedName("totalAmount")
        @Expose
        private String totalAmount;
        @SerializedName("couponCode")
        @Expose
        private String couponCode;



        public String getCouponCode() {
            return couponCode;
        }

        public void setCouponCode(String couponCode) {
            this.couponCode = couponCode;
        }



        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        @SerializedName("discount")
        @Expose
        private String discount;




        public String getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }



        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }


        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public Boolean getDelete() {
            return isDelete;
        }

        public void setDelete(Boolean delete) {
            isDelete = delete;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getUpdated() {
            return updated;
        }

        public void setUpdated(String updated) {
            this.updated = updated;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getOtpVerified() {
            return isOtpVerified;
        }

        public void setOtpVerified(Boolean otpVerified) {
            isOtpVerified = otpVerified;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getAccountCode() {
            return accountCode;
        }

        public void setAccountCode(String accountCode) {
            this.accountCode = accountCode;
        }

        @SerializedName("createdBy")
        @Expose
        private String createdBy;
        @SerializedName("deliveryInstruction")
        @Expose
        private String deliveryInstruction;
        @SerializedName("amountAfterCoupenApplied")
        @Expose
        private Integer amountAfterCoupenApplied;
        @SerializedName("reciepientId")
        @Expose
        private String reciepientId;
        @SerializedName("pickupAddressId")
        @Expose
        private String pickupAddressId;
        @SerializedName("isSecureDelivery")
        @Expose
        private Integer isSecureDelivery;
        @SerializedName("deliveryType")
        @Expose
        private Integer deliveryType;
        @SerializedName("coupenId")
        @Expose
        private Object coupenId;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("items")
        @Expose
        private List<Item> items = null;
        @SerializedName("total")
        @Expose
        private Integer total;
        @SerializedName("deliveryStatus")
        @Expose
        private Integer deliveryStatus;
        @SerializedName("deliveryBoyId")
        @Expose
        private Object deliveryBoyId;
        @SerializedName("orderCompleted")
        @Expose
        private Integer orderCompleted;
        @SerializedName("isAccepted")
        @Expose
        private Integer isAccepted;
        @SerializedName("paymentType")
        @Expose
        private Integer paymentType;
        @SerializedName("createdAt")
        @Expose
        private Long createdAt;

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public Integer getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getDeliveryInstruction() {
            return deliveryInstruction;
        }

        public void setDeliveryInstruction(String deliveryInstruction) {
            this.deliveryInstruction = deliveryInstruction;
        }

        public Integer getAmountAfterCoupenApplied() {
            return amountAfterCoupenApplied;
        }

        public void setAmountAfterCoupenApplied(Integer amountAfterCoupenApplied) {
            this.amountAfterCoupenApplied = amountAfterCoupenApplied;
        }

        public String getReciepientId() {
            return reciepientId;
        }

        public void setReciepientId(String reciepientId) {
            this.reciepientId = reciepientId;
        }

        public String getPickupAddressId() {
            return pickupAddressId;
        }

        public void setPickupAddressId(String pickupAddressId) {
            this.pickupAddressId = pickupAddressId;
        }

        public Integer getIsSecureDelivery() {
            return isSecureDelivery;
        }

        public void setIsSecureDelivery(Integer isSecureDelivery) {
            this.isSecureDelivery = isSecureDelivery;
        }

        public Integer getDeliveryType() {
            return deliveryType;
        }

        public void setDeliveryType(Integer deliveryType) {
            this.deliveryType = deliveryType;
        }

        public Object getCoupenId() {
            return coupenId;
        }

        public void setCoupenId(Object coupenId) {
            this.coupenId = coupenId;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getDeliveryStatus() {
            return deliveryStatus;
        }

        public void setDeliveryStatus(Integer deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public Object getDeliveryBoyId() {
            return deliveryBoyId;
        }

        public void setDeliveryBoyId(Object deliveryBoyId) {
            this.deliveryBoyId = deliveryBoyId;
        }

        public Integer getOrderCompleted() {
            return orderCompleted;
        }

        public void setOrderCompleted(Integer orderCompleted) {
            this.orderCompleted = orderCompleted;
        }

        public Integer getIsAccepted() {
            return isAccepted;
        }

        public void setIsAccepted(Integer isAccepted) {
            this.isAccepted = isAccepted;
        }

        public Integer getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
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

        @SerializedName("updatedAt")
        @Expose
        private Long updatedAt;

        public class Item {

            @SerializedName("itemId")
            @Expose
            private String itemId;
            @SerializedName("quantity")
            @Expose
            private Integer quantity;
            @SerializedName("price")
            @Expose
            private Integer price;

            public String getItemId() {
                return itemId;
            }

            public void setItemId(String itemId) {
                this.itemId = itemId;
            }

            public Integer getQuantity() {
                return quantity;
            }

            public void setQuantity(Integer quantity) {
                this.quantity = quantity;
            }

            public Integer getPrice() {
                return price;
            }

            public void setPrice(Integer price) {
                this.price = price;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            @SerializedName("_id")
            @Expose
            private String id;
        }

    }


}
