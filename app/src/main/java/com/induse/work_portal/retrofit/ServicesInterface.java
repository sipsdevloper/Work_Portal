package com.induse.work_portal.retrofit;

import com.induse.work_portal.entity.MyTaskEntity;
import com.induse.work_portal.timesheet.Sheettask;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ServicesInterface {

    // @FormUrlEncoded
    //  @POST("updatedriver")
    //   Call<ServicesResponseBean> LoiginAccountCode(@Field("username") String username,
    //                @Field("password") String password);

    // @FormUrlEncoded
    //  @POST("http://sipshrms.in/hrms_api/webservices/index.php?apicall=addCompOff")
    //  Call<Cheking>Compoff(
    //      @Field("emp_id") String emp_id,
    //  @Field("date") String Date,
    //    @Field("reason") String reason);


    //  @FormUrlEncoded
    //  @POST("webservices/index.php?apicall=updatedriver")
    //  Call<UpdateDriverEntity> Driverupdate(
    //         @Field("emp_id") String emp_id,
    ////        @Field("v_code") String v_code,
    //         @Field("mark") String mark);


    //@FormUrlEncoded
    // @POST("webservices/index.php?apicall=remove_driver_assign")
    //Call<UnassignDriver> Driverdelete(
    //    @Field("emp_id") String emp_id);


    //  @FormUrlEncoded
    //  @POST("webservices/index.php?apicall=driver_attendance")
    //  Call<Users> Driverupdateattendence(
    //         @Field("reporting_id") String reporting_id);

    // @FormUrlEncoded
    // @POST("webservices/index.php?apicall=driver_attendance")
    // Call<User3> Driveratten(
    //        @Field("reporting_id") String reporting_id);


    // @FormUrlEncoded
    // @POST("webservices/index.php?apicall=vehicle_details")
    // Call<User4> vhicalalldetails(
    //        @Field("reporting_id") String reporting_id);


    // @FormUrlEncoded
    // @POST("webservices/index.php?apicall=vehicle_entries")
    // Call<Users> Driverupdate1(
    //         @Field("reporting_id") String reporting_id);


    // String URL_BASE = "http://1.6.10.113/approve_api2/webservices/index.php?apicall=addmark1";

//    @Headers("Content-Type: application/json")
    // @POST("webservices/index.php?apicall=addmark1")
    // Call<ResponseEntity2> getUser(@Body Entity body);
    // Call<Totalpres> getUser(@Body Entity body);

    @FormUrlEncoded
    @POST("get_my_task")
    Call<MyTaskEntity> getMyTask(
            @Field("staffid") String staffid);


    @FormUrlEncoded
    @POST("get_my_timesheet")
    Call<Sheettask> getMyTimesheet(
            @Field("staffid") String staffid);








    @GET("insert_start_time?")
    Call<MyTaskEntity> getStartTime(
            @Query("start_time") String starttime, @Query("staffid") String staffid);

    @FormUrlEncoded
    @POST("insert_end_time")
    Call<MyTaskEntity> getEndTime(
            @Field("id") String id,
            @Field("end_time") String end_time,
            @Field("task_id") String task_id,
            @Field("note") String note

    );

    public static ServicesInterface create() {
        HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
        logger.setLevel(HttpLoggingInterceptor.Level.BASIC);
        logger.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logger)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(50, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request.Builder requestBuilder = chain.request().newBuilder();
                        requestBuilder.header("Content-Type", "application/json");
                        return chain.proceed(requestBuilder.build());
                    }
                })
                .build();
        String BASE_URL = "http://work.sipstech.in/api/";

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ServicesInterface.class);
    }
}