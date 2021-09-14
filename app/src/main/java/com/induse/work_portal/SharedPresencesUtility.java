package com.induse.work_portal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPresencesUtility {
    //SharedPreferences file name
    private static String SHARED_PREFS_FILE_NAME = "mark_app_shared_prefs";
public   static   SharedPreferences.Editor editor;
 public   static SharedPreferences sharedPreferences;
 @SuppressLint("StaticFieldLeak")
 public   static  SharedPresencesUtility sharedPresencesUtility;
    private Context context;


    @SuppressLint("CommitPrefEdits")
    public SharedPresencesUtility(Context context) {
        sharedPreferences =  context.getSharedPreferences(SHARED_PREFS_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    public static  SharedPresencesUtility getInstance(Context context){
        if(sharedPresencesUtility == null)
            sharedPresencesUtility = new SharedPresencesUtility(context);
        return sharedPresencesUtility;
    }


    public static void setIsLoggedin(Context context, boolean value) {
        editor.putBoolean("isLogin", value).apply();
    }
    public static boolean getIsLoggedin(Context context) {
        return sharedPreferences.getBoolean("isLogin",false);
    }

    public static void setfname(Context context, String value) {
        editor.putString("name", value).apply();
    }
    public static String getfname(Context context) {
        return sharedPreferences.getString("name", "");
    }

    public static void setId(Context context, String value) {
        editor.putString("id_str", value).apply();
    }
    public static String getId(Context context) {
        return sharedPreferences.getString("id_str", "");
    }

    public  void setEmpId(Context context, String value) {
      editor.putString("emp_id_str", value).apply();
    }
    public  String getEmpId(Context context) {
        return sharedPreferences.getString("emp_id_str", "");
    }

    //Strings
    public static void setUserName(Context context, String value) {
       editor.putString("user_name_str", value).commit();
    }
    public static String getUserName() {
        return sharedPreferences.getString("user_name_str", "");
    }





    public static String getUserDesignation(Context context) {
        return sharedPreferences.getString("user_designation_str", "");
    }

   public static void setimage(Context context, String value) {
       editor.putString("user_image", value).commit();
   }
   public static String getimage(Context context) {
       return sharedPreferences.getString("user_image", "man.png"); }



    //Strings
    public static void setUserDesignation(Context context, String value) {
      editor.putString("user_designation_str", value).commit();
    }
    public static void setLocationId(Context context, String value) {
      editor.putString("user_loc_id", value).commit();
    }
    public static String getLocationId(Context context) {
        return  sharedPreferences.getString("user_loc_id", "1");
    }

    public void setLogin(boolean login){
        editor.putBoolean("login", login).apply();
    }

    public boolean getLogin(){
    return     sharedPreferences.getBoolean("login", false);
    }

   public void logout(){
        editor = sharedPreferences.edit();
        editor.clear().apply();
    }

}
