package com.induse.work_portal.interfaces;


import com.android.volley.VolleyError;

/**
 * Created by Lalita Gill on 20/02/17.
 */

public interface ApiCallbackListener {
    void onResultCallback(String response, String flag);

    void onErrorCallback(VolleyError error);
}
