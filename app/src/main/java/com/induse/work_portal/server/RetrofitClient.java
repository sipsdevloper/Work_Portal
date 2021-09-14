package com.induse.work_portal.server;

import android.annotation.SuppressLint;
import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tanuj yadav on 27/03/2018.
 */

public class RetrofitClient {

    public static long DEFAULT_READ_TIMEOUT_SEC=3000;
    public static long DEFAULT_CONNECT_TIMEOUT_SEC=6000;
    public static long MAX_RETRY_COUNT=3;
        @SuppressWarnings("unused")
private static final String TAG = "RetrofitClient";

        private static Retrofit sRetrofit = null;
        @SuppressLint("StaticFieldLeak")
        private static Context sContext;

        public static Retrofit getClient(Context context) {
            if (sRetrofit == null) {
                sContext = context.getApplicationContext(); // in case you need it
                sRetrofit = new Retrofit.Builder().baseUrl("http://18.221.126.139/foodTruck/api/customer/") // to support Refrofit2 via RxAndroid
                        //  .addConverterFactory(ScalarsConverterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create()).client(getOkHttpClientBuilder().build()).build();
            }
            return sRetrofit;
        }

        private static OkHttpClient.Builder getOkHttpClientBuilder() {
            OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
            okHttpClientBuilder.readTimeout(DEFAULT_READ_TIMEOUT_SEC, TimeUnit.SECONDS).connectTimeout(DEFAULT_CONNECT_TIMEOUT_SEC, TimeUnit.SECONDS);
        /*    okHttpClientBuilder.interceptors().add(chain -> {
                Request request = chain.request();
                Response response = chain.proceed(request);
                int tryCount = 0;
                while (!response.isSuccessful() && tryCount < MAX_RETRY_COUNT) {
                    Log.i(TAG, "Request is not successful Attempt #" + tryCount);
                    tryCount++;
                    response = chain.proceed(request);
                }
                return response;
            });*/

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpClientBuilder.addInterceptor(logging);


            return okHttpClientBuilder;
        }
}
