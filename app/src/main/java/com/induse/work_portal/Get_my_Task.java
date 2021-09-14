package com.induse.work_portal;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.induse.work_portal.retrofit.ServicesInterface;
import com.induse.work_portal.timesheet.Sheettask;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Get_my_Task extends BaseActivity {
    ListView lvDetail;
    My_Base_Adapter adapter;
    Context context;
    ArrayList<Sheettask> myList = new ArrayList();
    String  staffid = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_my__task);
        lvDetail =(ListView)findViewById(R.id.lv1);
        staffid=presencesUtility.getEmpId(getApplicationContext());
        hitLoginApi();
    }

    void hitLoginApi() {
       // serchdriver.setText("");
        Log.e("TAG", "hitLoginApi");
        final ProgressDialog progressDialog = new ProgressDialog(Get_my_Task.this);
        progressDialog.show();
        progressDialog.setMessage("Progress is continue Your activity");
        try {
            ServicesInterface servicesInterface = ServicesInterface.create();
            Call<Sheettask> apiCall = null;
            apiCall = servicesInterface.getMyTimesheet(
                    staffid);
            apiCall.enqueue(new Callback<Sheettask>() {
                @Override
                public void onResponse(Call<Sheettask> call, Response<Sheettask> response) {
                    progressDialog.dismiss();
                    if (response.isSuccessful()) {
                        Sheettask bean = ((Sheettask) response.body());
                        Log.e("Response", response.toString());
                        if (bean.getResponseCode().equalsIgnoreCase("200")) {
                           // drivertotalls.setText("" + bean.getTotal().getTotal_driver());
                           // driverp.setText("" + bean.getTotal().getPresent_driver());
                           // drivera.setText("" + bean.getTotal().getAbsent_driver());
                            myList = (ArrayList) bean.getData();
                            adapter = new My_Base_Adapter(Get_my_Task.this,bean.getData());
                            lvDetail.setAdapter(adapter);
                        }
                    }
                }

                @Override
                public void onFailure(Call<Sheettask> call, Throwable t) {
                    // Toast.makeText(Driver.this,t.getMessage(), Toast.LENGTH_SHORT).show();
//                    Toast.makeText(context, "no data found", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            });
        } catch (Exception e) {

        }

    }

}