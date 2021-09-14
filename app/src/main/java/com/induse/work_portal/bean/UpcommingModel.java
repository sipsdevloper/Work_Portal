package com.induse.work_portal.bean;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpcommingModel {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @SerializedName("name")
        @Expose
        private String name;
        public String getCat_name() {
            return cat_name;
        }

        public void setCat_name(String cat_name) {
            this.cat_name = cat_name;
        }

        @SerializedName("cat_name")
        @Expose
        private String cat_name;
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
        @SerializedName("deliveryStatus")
        @Expose
        private Integer deliveryStatus;
        @SerializedName("items")
        @Expose
        private List<Item> items = null;
        @SerializedName("coupenId")
        @Expose
        private String coupenId;
        @SerializedName("totalAmount")
        @Expose
        private Integer totalAmount;
        @SerializedName("discount")
        @Expose
        private Integer discount;
        @SerializedName("amountAfterCoupenApplied")
        @Expose
        private double amountAfterCoupenApplied;
        @SerializedName("deliveryBoyId")
        @Expose
        private Object deliveryBoyId;
        @SerializedName("orderCompleted")
        @Expose
        private Integer orderCompleted;
        @SerializedName("isSecureDelivery")
        @Expose
        private Integer isSecureDelivery;
        @SerializedName("deliveryType")
        @Expose
        private Integer deliveryType;
        @SerializedName("isAccepted")
        @Expose
        private Integer isAccepted;
        @SerializedName("paymentType")
        @Expose
        private Integer paymentType;
        @SerializedName("createdAt")
        @Expose
        private Long createdAt;
        @SerializedName("updatedAt")
        @Expose
        private Long updatedAt;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("createdBy")
        @Expose
        private String createdBy;
        @SerializedName("reciepientId")
        @Expose
        private String reciepientId;
        @SerializedName("pickupAddressId")
        @Expose
        private String pickupAddressId;

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        @SerializedName("order_id")
        @Expose
        private String order_id;
        @SerializedName("__v")
        @Expose
        private Integer v;


        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        @SerializedName("otp")
        @Expose
        private String otp;



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

        public String getCoupenId() {
            return coupenId;
        }

        public void setCoupenId(String coupenId) {
            this.coupenId = coupenId;
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

        public double getAmountAfterCoupenApplied() {
            return amountAfterCoupenApplied;
        }

        public void setAmountAfterCoupenApplied(double amountAfterCoupenApplied) {
            this.amountAfterCoupenApplied = amountAfterCoupenApplied;
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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @SerializedName("name")
            @Expose
            private String name;

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

    }

}
