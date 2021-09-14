package com.induse.work_portal;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPresence{

    static SharedPreferences abgo_preference;

    public static final String KEY_DEFAULT_PREFERENCE = "com.abgoscanner.myapplication";
    private static String SHARED_PREFERENCE_MAIN = "SHARED_PREFERENCE_MAIN";
    public static final String ABGO_PREF = "abgopreferences";
    public static final String ABGO_ISLOGIN = "islogin";


    public static SharedPreferences getDefaultPref(Context context) {
        if (abgo_preference == null) {
            abgo_preference = context.getSharedPreferences(
                    KEY_DEFAULT_PREFERENCE, Context.MODE_PRIVATE);
        }
        return abgo_preference;
    }

    public static void clearpreferences(Context context) {
        SharedPreferences.Editor editor = getDefaultPref(context).edit();
        editor.clear();
        editor.commit();
    }



    public static boolean getIsLogin(Context context) {
        return getDefaultPref(context).getBoolean(ABGO_ISLOGIN, false);
    }

    public static void setIsLogin(Context context, boolean username) {
        SharedPreferences.Editor editor = getDefaultPref(context).edit();
        editor.putBoolean(ABGO_ISLOGIN, username);
        editor.commit();
    }
}
