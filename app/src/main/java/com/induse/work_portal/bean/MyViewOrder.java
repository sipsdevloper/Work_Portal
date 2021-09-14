package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyViewOrder {


    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private Response response;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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


    public static class Response {

        @SerializedName("total")
        @Expose
        private Integer total;
        @SerializedName("deliveryInstruction")
        @Expose
        private String deliveryInstruction;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("otp")
        @Expose
        private String otp;
        @SerializedName("deliveryStatus")
        @Expose
        private Integer deliveryStatus;
        @SerializedName("items")
        @Expose
        private List<Item> items = null;
        @SerializedName("coupenId")
        @Expose
        private Object coupenId;
        @SerializedName("totalAmount")
        @Expose
        private Integer totalAmount;
        @SerializedName("rejectedDeliveryBoylist")
        @Expose
        private List<String> rejectedDeliveryBoylist = null;

        public DeliveryBoyId getDeliveryBoyId() {
            return deliveryBoyId;
        }

        public void setDeliveryBoyId(DeliveryBoyId deliveryBoyId) {
            this.deliveryBoyId = deliveryBoyId;
        }

        @SerializedName("deliveryBoyId")
        @Expose
        private DeliveryBoyId deliveryBoyId;
        @SerializedName("discount")
        @Expose
        private Integer discount;
        @SerializedName("amountAfterCoupenApplied")
        @Expose
        private double amountAfterCoupenApplied;
        @SerializedName("isPaymentReceived")
        @Expose
        private Integer isPaymentReceived;

        @SerializedName("orderCompleted")
        @Expose
        private Integer orderCompleted;
        @SerializedName("isSecureDelivery")
        @Expose
        private Integer isSecureDelivery;
        @SerializedName("isScheduleDelivery")
        @Expose
        private Integer isScheduleDelivery;
        @SerializedName("deliveryType")
        @Expose
        private Integer deliveryType;

        @SerializedName("isAccepted")
        @Expose
        private Integer isAccepted;

        @SerializedName("is_otp_verified")
        @Expose
        private Integer isOtpVerified;

        @SerializedName("paymentType")
        @Expose
        private Integer paymentType;

//        @SerializedName("createdAt")
//        @Expose
//        private Long createdAt;
//        @SerializedName("updatedAt")
//        @Expose
//        private Long updatedAt;

        @SerializedName("_id")
        @Expose
        private String id;

        @SerializedName("createdBy")
        @Expose
        private CreatedBy createdBy;

        @SerializedName("reciepientId")
        @Expose
        private ReciepientId reciepientId;

        @SerializedName("pickupAddressId")
        @Expose
        private PickupAddressId pickupAddressId;

        @SerializedName("__v")
        @Expose
        private Integer v;

        @SerializedName("picklat")
        @Expose
        private Double picklat;

        @SerializedName("picklong")
        @Expose
        private Double picklong;

        @SerializedName("droplat")
        @Expose
        private Double droplat;

        @SerializedName("droplong")
        @Expose
        private Double droplong;

        @SerializedName("pickLat")
        @Expose
        private Double pickLat;

        @SerializedName("pickLong")
        @Expose
        private Double pickLong;

        @SerializedName("dropLat")
        @Expose
        private Double dropLat;

        @SerializedName("secure_delivery_cost")
        @Expose
        private String secure_delivery_cost;
        @SerializedName("fast_delivery_cost")
        @Expose
        private String fast_delivery_cost;
        @SerializedName("delivery_charge")
        @Expose
        private String delivery_charge;

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

        public String getDelivery_charge() {
            return delivery_charge;
        }

        public void setDelivery_charge(String delivery_charge) {
            this.delivery_charge = delivery_charge;
        }

        public String getVat() {
            return vat;
        }

        public void setVat(String vat) {
            this.vat = vat;
        }

        @SerializedName("vat")
        @Expose
        private String vat;

        public Double getPickLat() {
            return pickLat;
        }

        public void setPickLat(Double pickLat) {
            this.pickLat = pickLat;
        }

        public Double getPickLong() {
            return pickLong;
        }

        public void setPickLong(Double pickLong) {
            this.pickLong = pickLong;
        }

        public Double getDropLat() {
            return dropLat;
        }

        public void setDropLat(Double dropLat) {
            this.dropLat = dropLat;
        }

        public Double getDropLong() {
            return dropLong;
        }

        public void setDropLong(Double dropLong) {
            this.dropLong = dropLong;
        }

        @SerializedName("dropLong")
        @Expose
        private Double dropLong;





        public Double getPicklat() {
            return picklat;
        }

        public void setPicklat(Double picklat) {
            this.picklat = picklat;
        }

        public Double getPicklong() {
            return picklong;
        }

        public void setPicklong(Double picklong) {
            this.picklong = picklong;
        }

        public Double getDroplat() {
            return droplat;
        }

        public void setDroplat(Double droplat) {
            this.droplat = droplat;
        }

        public Double getDroplong() {
            return droplong;
        }

        public void setDroplong(Double droplong) {
            this.droplong = droplong;
        }


        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public String getDeliveryInstruction() {
            return deliveryInstruction;
        }

        public void setDeliveryInstruction(String deliveryInstruction) {
            this.deliveryInstruction = deliveryInstruction;
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

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public Integer getDeliveryStatus() {
            return deliveryStatus;
        }

        public void setDeliveryStatus(Integer deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public Object getCoupenId() {
            return coupenId;
        }

        public void setCoupenId(Object coupenId) {
            this.coupenId = coupenId;
        }

        public Integer getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
        }

        public List<String> getRejectedDeliveryBoylist() {
            return rejectedDeliveryBoylist;
        }

        public void setRejectedDeliveryBoylist(List<String> rejectedDeliveryBoylist) {
            this.rejectedDeliveryBoylist = rejectedDeliveryBoylist;
        }

        public Integer getDiscount() {
            return discount;
        }

        public void setDiscount(Integer discount) {
            this.discount = discount;
        }

        public double getAmountAfterCoupenApplied() {
            return amountAfterCoupenApplied;
        }

        public void setAmountAfterCoupenApplied(double amountAfterCoupenApplied) {
            this.amountAfterCoupenApplied = amountAfterCoupenApplied;
        }

        public Integer getIsPaymentReceived() {
            return isPaymentReceived;
        }

        public void setIsPaymentReceived(Integer isPaymentReceived) {
            this.isPaymentReceived = isPaymentReceived;
        }


        public Integer getOrderCompleted() {
            return orderCompleted;
        }

        public void setOrderCompleted(Integer orderCompleted) {
            this.orderCompleted = orderCompleted;
        }

        public Integer getIsSecureDelivery() {
            return isSecureDelivery;
        }

        public void setIsSecureDelivery(Integer isSecureDelivery) {
            this.isSecureDelivery = isSecureDelivery;
        }

        public Integer getIsScheduleDelivery() {
            return isScheduleDelivery;
        }

        public void setIsScheduleDelivery(Integer isScheduleDelivery) {
            this.isScheduleDelivery = isScheduleDelivery;
        }

        public Integer getDeliveryType() {
            return deliveryType;
        }

        public void setDeliveryType(Integer deliveryType) {
            this.deliveryType = deliveryType;
        }

        public Integer getIsAccepted() {
            return isAccepted;
        }

        public void setIsAccepted(Integer isAccepted) {
            this.isAccepted = isAccepted;
        }

        public Integer getIsOtpVerified() {
            return isOtpVerified;
        }

        public void setIsOtpVerified(Integer isOtpVerified) {
            this.isOtpVerified = isOtpVerified;
        }

        public Integer getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
        }

//        public Long getCreatedAt() {
//            return createdAt;
//        }
//
//        public void setCreatedAt(Long createdAt) {
//            this.createdAt = createdAt;
//        }
//
//        public Long getUpdatedAt() {
//            return updatedAt;
//        }
//
//        public void setUpdatedAt(Long updatedAt) {
//            this.updatedAt = updatedAt;
//        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public CreatedBy getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(CreatedBy createdBy) {
            this.createdBy = createdBy;
        }

        public ReciepientId getReciepientId() {
            return reciepientId;
        }

        public void setReciepientId(ReciepientId reciepientId) {
            this.reciepientId = reciepientId;
        }

        public PickupAddressId getPickupAddressId() {
            return pickupAddressId;
        }

        public void setPickupAddressId(PickupAddressId pickupAddressId) {
            this.pickupAddressId = pickupAddressId;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }


        public class Item {

            @SerializedName("quantity")
            @Expose
            private Integer quantity;
            @SerializedName("price")
            @Expose
            private Integer price;
            @SerializedName("itemId")
            @Expose
            private String itemId;
            @SerializedName("_id")
            @Expose
            private String id;


            @SerializedName("name")
            @Expose
            private String name;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            @SerializedName("image")
            @Expose
            private String image;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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

            public String getItemId() {
                return itemId;
            }

            public void setItemId(String itemId) {
                this.itemId = itemId;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

        }

        public class DeliveryBoyId {

            @SerializedName("latLong")
            @Expose
            private LatLong latLong;
            @SerializedName("profileImage")
            @Expose
            private String profileImage;
            @SerializedName("country")
            @Expose
            private String country;
            @SerializedName("language")
            @Expose
            private String language;
            @SerializedName("otp")
            @Expose
            private String otp;
            @SerializedName("city")
            @Expose
            private String city;
            @SerializedName("address")
            @Expose
            private String address;
            @SerializedName("bank_name")
            @Expose
            private String bankName;
            @SerializedName("is_online")
            @Expose
            private Integer isOnline;
            @SerializedName("bank_account_number")
            @Expose
            private String bankAccountNumber;
            @SerializedName("carType")
            @Expose
            private String carType;
            @SerializedName("national_id_number")
            @Expose
            private String nationalIdNumber;
            @SerializedName("by_admin")
            @Expose
            private String byAdmin;
            @SerializedName("driver_license_number")
            @Expose
            private String driverLicenseNumber;
            @SerializedName("driver_registration_number")
            @Expose
            private String driverRegistrationNumber;
            @SerializedName("driver_national_id")
            @Expose
            private String driverNationalId;
            @SerializedName("deviceToken")
            @Expose
            private String deviceToken;
            @SerializedName("deviceType")
            @Expose
            private String deviceType;
            @SerializedName("isTcAccepted")
            @Expose
            private Integer isTcAccepted;
            @SerializedName("is_block")
            @Expose
            private String isBlock;
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
            @SerializedName("dob")
            @Expose
            private String dob;
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
            private final static long serialVersionUID = -3874341079965724470L;

            public LatLong getLatLong() {
                return latLong;
            }

            public void setLatLong(LatLong latLong) {
                this.latLong = latLong;
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

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
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

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getBankName() {
                return bankName;
            }

            public void setBankName(String bankName) {
                this.bankName = bankName;
            }

            public Integer getIsOnline() {
                return isOnline;
            }

            public void setIsOnline(Integer isOnline) {
                this.isOnline = isOnline;
            }

            public String getBankAccountNumber() {
                return bankAccountNumber;
            }

            public void setBankAccountNumber(String bankAccountNumber) {
                this.bankAccountNumber = bankAccountNumber;
            }

            public String getCarType() {
                return carType;
            }

            public void setCarType(String carType) {
                this.carType = carType;
            }

            public String getNationalIdNumber() {
                return nationalIdNumber;
            }

            public void setNationalIdNumber(String nationalIdNumber) {
                this.nationalIdNumber = nationalIdNumber;
            }

            public String getByAdmin() {
                return byAdmin;
            }

            public void setByAdmin(String byAdmin) {
                this.byAdmin = byAdmin;
            }

            public String getDriverLicenseNumber() {
                return driverLicenseNumber;
            }

            public void setDriverLicenseNumber(String driverLicenseNumber) {
                this.driverLicenseNumber = driverLicenseNumber;
            }

            public String getDriverRegistrationNumber() {
                return driverRegistrationNumber;
            }

            public void setDriverRegistrationNumber(String driverRegistrationNumber) {
                this.driverRegistrationNumber = driverRegistrationNumber;
            }

            public String getDriverNationalId() {
                return driverNationalId;
            }

            public void setDriverNationalId(String driverNationalId) {
                this.driverNationalId = driverNationalId;
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

            public Integer getIsTcAccepted() {
                return isTcAccepted;
            }

            public void setIsTcAccepted(Integer isTcAccepted) {
                this.isTcAccepted = isTcAccepted;
            }

            public String getIsBlock() {
                return isBlock;
            }

            public void setIsBlock(String isBlock) {
                this.isBlock = isBlock;
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

            public String getDob() {
                return dob;
            }

            public void setDob(String dob) {
                this.dob = dob;
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

            public class LatLong {
                @SerializedName("type")
                @Expose
                private String type;
                @SerializedName("coordinates")
                @Expose
                private List<Double> coordinates = null;
                private final static long serialVersionUID = 7951806399510796835L;

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

        public class CreatedBy {

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
            @SerializedName("shopName")
            @Expose
            private String shopName;
            @SerializedName("deviceToken")
            @Expose
            private String deviceToken;
            @SerializedName("deviceType")
            @Expose
            private Integer deviceType;
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

            public Integer getDeviceType() {
                return deviceType;
            }

            public void setDeviceType(Integer deviceType) {
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

        }


        public class PickupAddressId {

            @SerializedName("addressLine1")
            @Expose
            private String addressLine1;
            @SerializedName("addressLine2")
            @Expose
            private String addressLine2;
            @SerializedName("area")
            @Expose
            private String area;
            @SerializedName("city")
            @Expose
            private String city;
            @SerializedName("zipCode")
            @Expose
            private Integer zipCode;
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

            public Integer getZipCode() {
                return zipCode;
            }

            public void setZipCode(Integer zipCode) {
                this.zipCode = zipCode;
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

        }

        public class ReciepientId {

            @SerializedName("phone")
            @Expose
            private String phone;
            @SerializedName("countryCode")
            @Expose
            private String countryCode;
            @SerializedName("addressLine1")
            @Expose
            private String addressLine1;
            @SerializedName("addressLine2")
            @Expose
            private String addressLine2;
            @SerializedName("isAccepted")
            @Expose
            private Integer isAccepted;
            @SerializedName("created")
            @Expose
            private String created;
            @SerializedName("updated")
            @Expose
            private String updated;
            @SerializedName("_id")
            @Expose
            private String id;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("email")
            @Expose
            private String email;
            @SerializedName("__v")
            @Expose
            private Integer v;

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getCountryCode() {
                return countryCode;
            }

            public void setCountryCode(String countryCode) {
                this.countryCode = countryCode;
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

            public Integer getIsAccepted() {
                return isAccepted;
            }

            public void setIsAccepted(Integer isAccepted) {
                this.isAccepted = isAccepted;
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

            public Integer getV() {
                return v;
            }

            public void setV(Integer v) {
                this.v = v;
            }
        }
    }

}
