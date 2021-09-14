
package com.induse.work_portal.entity; ;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyTaskEntity implements Serializable
{

    @SerializedName("success")
    @Expose
    private boolean success;

    @SerializedName("response_code")
    @Expose
    private String responseCode;
    @SerializedName("msg")
    @Expose
    private String msg;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    private final static long serialVersionUID = -5160095562618311687L;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
