package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EditProfileModel {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("userInfo")
    @Expose
    private UserInfo userInfo;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public class UserInfo {

        @SerializedName("profileImage")
        @Expose
        private String profileImage;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("otp")
        @Expose
        private String otp;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("is_block")
        @Expose
        private String isBlock;
        @SerializedName("shopName")
        @Expose
        private String shopName;
        @SerializedName("deviceToken")
        @Expose
        private String deviceToken;
        @SerializedName("deviceType")
        @Expose
        private String deviceType;
        @SerializedName("isDelete")
        @Expose
        private Boolean isDelete;
        @SerializedName("_id")
        @Expose
        private String id;
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
        @SerializedName("accountCode")
        @Expose
        private String accountCode;
        @SerializedName("__v")
        @Expose
        private Integer v;
        @SerializedName("token")
        @Expose
        private String token;

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

        public String getIsBlock() {
            return isBlock;
        }

        public void setIsBlock(String isBlock) {
            this.isBlock = isBlock;
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

        public String getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(String deviceType) {
            this.deviceType = deviceType;
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

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
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

        public Boolean getIsOtpVerified() {
            return isOtpVerified;
        }

        public void setIsOtpVerified(Boolean isOtpVerified) {
            this.isOtpVerified = isOtpVerified;
        }

        public String getAccountCode() {
            return accountCode;
        }

        public void setAccountCode(String accountCode) {
            this.accountCode = accountCode;
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

    }

}
