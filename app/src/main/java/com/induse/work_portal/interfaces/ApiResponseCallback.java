package com.induse.work_portal.interfaces;

/**
 * Created by Ankit Chaudhary on 8/9/2017.
 */

public interface ApiResponseCallback
{
    void onResultCallback(String response);

    void onErrorCallback(String error);
}
