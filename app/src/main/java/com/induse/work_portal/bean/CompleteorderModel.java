package com.induse.work_portal.bean;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CompleteorderModel {


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

        @SerializedName("_id")
        @Expose
        private String id;
//        @SerializedName("picklatLong")
//        @Expose
//        private PicklatLong picklatLong;
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
        @SerializedName("paymentType")
        @Expose
        private Integer paymentType;
        @SerializedName("totalAmount")
        @Expose
        private Integer totalAmount;
        @SerializedName("discount")
        @Expose
        private Integer discount;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("cat_name")
        @Expose
        private String catName;
        @SerializedName("otp")
        @Expose
        private String otp;
        @SerializedName("delivery_charge")
        @Expose
        private String deliveryCharge;
        @SerializedName("vat")
        @Expose
        private String vat;
        @SerializedName("secure_delivery_cost")
        @Expose
        private String secureDeliveryCost;
        @SerializedName("fast_delivery_cost")
        @Expose
        private String fastDeliveryCost;
        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("isScheduleDelivery")
        @Expose
        private Integer isScheduleDelivery;
        @SerializedName("catId")
        @Expose
        private String catId;
        @SerializedName("is_otp_verified")
        @Expose
        private Integer isOtpVerified;
        @SerializedName("items")
        @Expose
        private List<Item> items = null;
        @SerializedName("isPaymentReceived")
        @Expose
        private Integer isPaymentReceived;
        @SerializedName("total")
        @Expose
        private Integer total;
        @SerializedName("order_cancelled")
        @Expose
        private String orderCancelled;
        @SerializedName("isAllocate")
        @Expose
        private Integer isAllocate;
        @SerializedName("deliveryStatus")
        @Expose
        private String deliveryStatus;
        @SerializedName("pickup_time")
        @Expose
        private Long pickupTime;
        @SerializedName("on_way_time")
        @Expose
        private Long onWayTime;
        @SerializedName("delivered_time")
        @Expose
        private Object deliveredTime;
        @SerializedName("rejectedDeliveryBoylist")
        @Expose
        private List<Object> rejectedDeliveryBoylist = null;
        @SerializedName("driverSign")
        @Expose
        private String driverSign;
        @SerializedName("recepientCode")
        @Expose
        private String recepientCode;
        @SerializedName("deliveryBoyId")
        @Expose
        private String deliveryBoyId;
        @SerializedName("orderCompleted")
        @Expose
        private Integer orderCompleted;
        @SerializedName("isAccepted")
        @Expose
        private Integer isAccepted;
        @SerializedName("createdAt")
        @Expose
        private Long createdAt;
        @SerializedName("updatedAt")
        @Expose
        private Long updatedAt;
        @SerializedName("order_id")
        @Expose
        private String orderId;
        @SerializedName("__v")
        @Expose
        private Integer v;
        @SerializedName("rating")
        @Expose
        private List<Object> rating = null;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("avg_rating")
        @Expose
        private Float avgRating;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

//        public PicklatLong getPicklatLong() {
//            return picklatLong;
//        }
//
//        public void setPicklatLong(PicklatLong picklatLong) {
//            this.picklatLong = picklatLong;
//        }

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

        public Integer getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
        }

        public Integer getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
        }

        public Integer getDiscount() {
            return discount;
        }

        public void setDiscount(Integer discount) {
            this.discount = discount;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCatName() {
            return catName;
        }

        public void setCatName(String catName) {
            this.catName = catName;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public String getDeliveryCharge() {
            return deliveryCharge;
        }

        public void setDeliveryCharge(String deliveryCharge) {
            this.deliveryCharge = deliveryCharge;
        }

        public String getVat() {
            return vat;
        }

        public void setVat(String vat) {
            this.vat = vat;
        }

        public String getSecureDeliveryCost() {
            return secureDeliveryCost;
        }

        public void setSecureDeliveryCost(String secureDeliveryCost) {
            this.secureDeliveryCost = secureDeliveryCost;
        }

        public String getFastDeliveryCost() {
            return fastDeliveryCost;
        }

        public void setFastDeliveryCost(String fastDeliveryCost) {
            this.fastDeliveryCost = fastDeliveryCost;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Integer getIsScheduleDelivery() {
            return isScheduleDelivery;
        }

        public void setIsScheduleDelivery(Integer isScheduleDelivery) {
            this.isScheduleDelivery = isScheduleDelivery;
        }

        public String getCatId() {
            return catId;
        }

        public void setCatId(String catId) {
            this.catId = catId;
        }

        public Integer getIsOtpVerified() {
            return isOtpVerified;
        }

        public void setIsOtpVerified(Integer isOtpVerified) {
            this.isOtpVerified = isOtpVerified;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public Integer getIsPaymentReceived() {
            return isPaymentReceived;
        }

        public void setIsPaymentReceived(Integer isPaymentReceived) {
            this.isPaymentReceived = isPaymentReceived;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public String getOrderCancelled() {
            return orderCancelled;
        }

        public void setOrderCancelled(String orderCancelled) {
            this.orderCancelled = orderCancelled;
        }

        public Integer getIsAllocate() {
            return isAllocate;
        }

        public void setIsAllocate(Integer isAllocate) {
            this.isAllocate = isAllocate;
        }

        public String getDeliveryStatus() {
            return deliveryStatus;
        }

        public void setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
        }

        public Long getPickupTime() {
            return pickupTime;
        }

        public void setPickupTime(Long pickupTime) {
            this.pickupTime = pickupTime;
        }

        public Long getOnWayTime() {
            return onWayTime;
        }

        public void setOnWayTime(Long onWayTime) {
            this.onWayTime = onWayTime;
        }

        public Object getDeliveredTime() {
            return deliveredTime;
        }

        public void setDeliveredTime(Object deliveredTime) {
            this.deliveredTime = deliveredTime;
        }

        public List<Object> getRejectedDeliveryBoylist() {
            return rejectedDeliveryBoylist;
        }

        public void setRejectedDeliveryBoylist(List<Object> rejectedDeliveryBoylist) {
            this.rejectedDeliveryBoylist = rejectedDeliveryBoylist;
        }

        public String getDriverSign() {
            return driverSign;
        }

        public void setDriverSign(String driverSign) {
            this.driverSign = driverSign;
        }

        public String getRecepientCode() {
            return recepientCode;
        }

        public void setRecepientCode(String recepientCode) {
            this.recepientCode = recepientCode;
        }

        public String getDeliveryBoyId() {
            return deliveryBoyId;
        }

        public void setDeliveryBoyId(String deliveryBoyId) {
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

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

        public List<Object> getRating() {
            return rating;
        }

        public void setRating(List<Object> rating) {
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Float getAvgRating() {
            return avgRating;
        }

        public void setAvgRating(Float avgRating) {
            this.avgRating = avgRating;
        }


        public class Item {

            @SerializedName("itemId")
            @Expose
            private String itemId;
            @SerializedName("image")
            @Expose
            private String image;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("quantity")
            @Expose
            private Integer quantity;
            @SerializedName("price")
            @Expose
            private Integer price;
            @SerializedName("_id")
            @Expose
            private String id;

            public String getItemId() {
                return itemId;
            }

            public void setItemId(String itemId) {
                this.itemId = itemId;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

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

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

        }

    }

}
