package com.induse.work_portal.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WalletHistoryModel {

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

        public String getCat_name() {
            return cat_name;
        }

        public void setCat_name(String cat_name) {
            this.cat_name = cat_name;
        }

        @SerializedName("cat_name")
        @Expose
        private String cat_name;


        public Double getWalletBalance() {
            return walletBalance;
        }

        public void setWalletBalance(Double walletBalance) {
            this.walletBalance = walletBalance;
        }

        @SerializedName("walletBalance")
        @Expose
            private double walletBalance;

        @SerializedName("today")
        @Expose
        private List<Today> today = null;
        @SerializedName("yesterday")
        @Expose
        private List<Today> yesterday = null;
        @SerializedName("all")
        @Expose
        private List<Today> all = null;

        public List<Today> getToday() {
            return today;
        }

        public void setToday(List<Today> today) {
            this.today = today;
        }

        public List<Today> getYesterday() {
            return yesterday;
        }

        public void setYesterday(List<Today> yesterday) {
            this.yesterday = yesterday;
        }

        public List<Today> getAll() {
            return all;
        }

        public void setAll(List<Today> all) {
            this.all = all;
        }


        public class Today {

            @SerializedName("cardId")
            @Expose
            private String cardId;
            @SerializedName("transctionId")
            @Expose
            private String transctionId;
            @SerializedName("transctionMode")
            @Expose
            private String transctionMode;
            @SerializedName("created")
            @Expose
            private Long created;
            @SerializedName("updated")
            @Expose
            private Long updated;
            @SerializedName("_id")
            @Expose
            private String id;
            @SerializedName("userId")
            @Expose
            private String userId;
            @SerializedName("amount")
            @Expose
            private Double amount;
            @SerializedName("transctionType")
            @Expose
            private String transctionType;
            @SerializedName("__v")
            @Expose
            private Integer v;

            private boolean isChecked = false;

            public boolean getIsChecked() {
                return isChecked;
            }

            public void setIsChecked(boolean checked) {
                isChecked = checked;
            }


            public String getCardId() {
                return cardId;
            }

            public void setCardId(String cardId) {
                this.cardId = cardId;
            }

            public String getTransctionId() {
                return transctionId;
            }

            public void setTransctionId(String transctionId) {
                this.transctionId = transctionId;
            }

            public String getTransctionMode() {
                return transctionMode;
            }

            public void setTransctionMode(String transctionMode) {
                this.transctionMode = transctionMode;
            }

            public Long getCreated() {
                return created;
            }

            public void setCreated(Long created) {
                this.created = created;
            }

            public Long getUpdated() {
                return updated;
            }

            public void setUpdated(Long updated) {
                this.updated = updated;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public Double getAmount() {
                return amount;
            }

            public void setAmount(Double amount) {
                this.amount = amount;
            }

            public String getTransctionType() {
                return transctionType;
            }

            public void setTransctionType(String transctionType) {
                this.transctionType = transctionType;
            }

            public Integer getV() {
                return v;
            }

            public void setV(Integer v) {
                this.v = v;
            }

        }




        public class Yesterday {

            @SerializedName("cardId")
            @Expose
            private String cardId;
            @SerializedName("transctionId")
            @Expose
            private String transctionId;
            @SerializedName("transctionMode")
            @Expose
            private String transctionMode;
            @SerializedName("created")
            @Expose
            private Long created;
            @SerializedName("updated")
            @Expose
            private Long updated;
            @SerializedName("_id")
            @Expose
            private String id;
            @SerializedName("userId")
            @Expose
            private String userId;
            @SerializedName("amount")
            @Expose
            private Integer amount;
            @SerializedName("transctionType")
            @Expose
            private String transctionType;
            @SerializedName("__v")
            @Expose
            private Integer v;

            public String getCardId() {
                return cardId;
            }

            public void setCardId(String cardId) {
                this.cardId = cardId;
            }

            public String getTransctionId() {
                return transctionId;
            }

            public void setTransctionId(String transctionId) {
                this.transctionId = transctionId;
            }

            public String getTransctionMode() {
                return transctionMode;
            }

            public void setTransctionMode(String transctionMode) {
                this.transctionMode = transctionMode;
            }

            public Long getCreated() {
                return created;
            }

            public void setCreated(Long created) {
                this.created = created;
            }

            public Long getUpdated() {
                return updated;
            }

            public void setUpdated(Long updated) {
                this.updated = updated;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public Integer getAmount() {
                return amount;
            }

            public void setAmount(Integer amount) {
                this.amount = amount;
            }

            public String getTransctionType() {
                return transctionType;
            }

            public void setTransctionType(String transctionType) {
                this.transctionType = transctionType;
            }

            public Integer getV() {
                return v;
            }

            public void setV(Integer v) {
                this.v = v;
            }

        }


        public class All {

            @SerializedName("cardId")
            @Expose
            private String cardId;
            @SerializedName("transctionId")
            @Expose
            private String transctionId;
            @SerializedName("transctionMode")
            @Expose
            private String transctionMode;
            @SerializedName("created")
            @Expose
            private Long created;
            @SerializedName("updated")
            @Expose
            private Long updated;
            @SerializedName("_id")
            @Expose
            private String id;
            @SerializedName("userId")
            @Expose
            private String userId;
            @SerializedName("amount")
            @Expose
            private Integer amount;
            @SerializedName("transctionType")
            @Expose
            private String transctionType;
            @SerializedName("__v")
            @Expose
            private Integer v;

            public String getCardId() {
                return cardId;
            }

            public void setCardId(String cardId) {
                this.cardId = cardId;
            }

            public String getTransctionId() {
                return transctionId;
            }

            public void setTransctionId(String transctionId) {
                this.transctionId = transctionId;
            }

            public String getTransctionMode() {
                return transctionMode;
            }

            public void setTransctionMode(String transctionMode) {
                this.transctionMode = transctionMode;
            }

            public Long getCreated() {
                return created;
            }

            public void setCreated(Long created) {
                this.created = created;
            }

            public Long getUpdated() {
                return updated;
            }

            public void setUpdated(Long updated) {
                this.updated = updated;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public Integer getAmount() {
                return amount;
            }

            public void setAmount(Integer amount) {
                this.amount = amount;
            }

            public String getTransctionType() {
                return transctionType;
            }

            public void setTransctionType(String transctionType) {
                this.transctionType = transctionType;
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
