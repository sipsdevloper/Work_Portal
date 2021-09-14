package com.induse.work_portal.bean;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class addMoneyToWallet {

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

        @SerializedName("walletInfo")
        @Expose
        private WalletInfo walletInfo;
        @SerializedName("totalAmount")
        @Expose
        private Integer totalAmount;

        public WalletInfo getWalletInfo() {
            return walletInfo;
        }

        public void setWalletInfo(WalletInfo walletInfo) {
            this.walletInfo = walletInfo;
        }

        public Integer getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
        }
        public class WalletInfo {

            @SerializedName("userId")
            @Expose
            private String userId;
            @SerializedName("amount")
            @Expose
            private Integer amount;
            @SerializedName("cardId")
            @Expose
            private String cardId;
            @SerializedName("transctionId")
            @Expose
            private String transctionId;
            @SerializedName("transctionMode")
            @Expose
            private String transctionMode;
            @SerializedName("transctionType")
            @Expose
            private String transctionType;
            @SerializedName("created")
            @Expose
            private String created;
            @SerializedName("updated")
            @Expose
            private String updated;
            @SerializedName("_id")
            @Expose
            private String id;
            @SerializedName("__v")
            @Expose
            private Integer v;

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

            public String getTransctionType() {
                return transctionType;
            }

            public void setTransctionType(String transctionType) {
                this.transctionType = transctionType;
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

            public Integer getV() {
                return v;
            }

            public void setV(Integer v) {
                this.v = v;
            }

        }

    }
}
