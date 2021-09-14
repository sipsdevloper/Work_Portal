package com.induse.work_portal;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.induse.work_portal.adapter.MyTaskAdapter;
import com.induse.work_portal.databinding.ActivityHomePageBinding;
import com.induse.work_portal.entity.Datum;
import com.induse.work_portal.entity.MyTaskEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home_Page extends BaseActivity {
  //  SharedPresencesUtility sharedPresence;
    SessionManager sessionManager;
    TextView fn;
    ImageView iv;
    MyTaskAdapter adapter;
    ActivityHomePageBinding binding;
    //SharedPresencesUtility presencesUtility;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home__page);
        Toolbar toolbar;
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#80000000"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //   presencesUtility =  SharedPresencesUtility.getInstance(getApplication());
        sessionManager = new SessionManager(getApplicationContext());
      // fn=(TextView) findViewById(R.id.ufn);
       // binding.ufn.seton
binding.ufn.setText(presencesUtility.getUserName());

        iv= findViewById(R.id.photouser);
        Glide.with(getApplication())
               .load(presencesUtility.getimage(getApplication()))
              .into(binding.photouser);
        init();
        listener();
    }

    @Override
    void init() {
        binding.rvMyTask.setHasFixedSize(true);
        binding.rvMyTask.setLayoutManager(new LinearLayoutManager(this));
        getMyTaskApi();
    }

    @Override
    void listener() {
        binding.btnStart.setOnClickListener(this);
        binding.btnSubmit.setOnClickListener(this);
        binding.btnCancel.setOnClickListener(this);
        binding.btnlogout.setOnClickListener(this);
        binding.btngettask.setOnClickListener(this);


    }

    void getMyTaskApi() {
        Call<MyTaskEntity> call;
        call = myApi.getMyTask(presencesUtility.getEmpId(getBaseContext()));
        call.enqueue(new Callback<MyTaskEntity>() {
            @Override
            public void onResponse(Call<MyTaskEntity> call, Response<MyTaskEntity> response) {
                MyTaskEntity entity = response.body();
                if (entity != null) {
                    if (entity.getData() != null && entity.getData().size() > 0) {
                        adapter = new MyTaskAdapter(Home_Page.this, (ArrayList<Datum>) entity.getData());
                        binding.rvMyTask.setAdapter(adapter);
                        adapter.notifyDataSetChanged();
                        Toast.makeText(getApplication(), "Success", Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<MyTaskEntity> call, Throwable t) {
                Toast.makeText(getApplication(), "Error", Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnCancel:
                binding.dialog.setVisibility(View.GONE);
                break;
            case R.id.btnStart:
                hitStartApi();
                break;
            case R.id.btnlogout:
                SharedPresence.clearpreferences(getApplication());
                SharedPresence.setIsLogin(getApplication(),false);
                Intent intent = new Intent(Home_Page.this, Login_Page.class);
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                 finish();
                break;
            case R.id.btngettask:

                Intent intent1 = new Intent(Home_Page.this,Get_my_Task.class);
                startActivity(intent1);
                finish();
                break;

            case R.id.btnSubmit:
                if (!binding.etNote.getText().toString().isEmpty())
                    hitEndApi(binding.etNote.getText().toString());
                else
                    Toast.makeText(getApplication(), "Please enter note.", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }

    void hitStartApi() {
        Call<MyTaskEntity> call;
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        Log.d("TAG", "timeStamp " + timeStamp);

//        Long tsLong = System.currentTimeMillis()/1000;
//        String timeStamp = tsLong.toString();

        call = myApi.getStartTime(timeStamp, presencesUtility.getEmpId(getBaseContext()));
        call.enqueue(new Callback<MyTaskEntity>() {
            @Override
            public void onResponse(Call<MyTaskEntity> call, Response<MyTaskEntity> response) {
                MyTaskEntity entity = response.body();

//                    if(entity != null && entity.getSuccess()){
//                        if(entity != null && !entity.getMsg().isEmpty()){
//                            Toast.makeText(getApplication(), ""+entity.getMsg(), Toast.LENGTH_LONG).show();
//                        }
//                    }
//                    else{
//                        Toast.makeText(getApplication(), ""+entity.getMsg(), Toast.LENGTH_LONG).show();
//                    }
                if (entity != null && !entity.getMsg().isEmpty()) {
                    Toast.makeText(getApplication(), "" + entity.getMsg(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<MyTaskEntity> call, Throwable t) {
                Toast.makeText(getApplication(), "eroor", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void hitEndApi(String note) {
        Call<MyTaskEntity> call;
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        Log.d("TAG", "timeStamp " + timeStamp);

//        Long tsLong = System.currentTimeMillis()/1000;
//        String timeStamp = tsLong.toString();

        call = myApi.getEndTime(presencesUtility.getEmpId(getBaseContext()), timeStamp, taskid, note);
        call.enqueue(new Callback<MyTaskEntity>() {
            @Override
            public void onResponse(Call<MyTaskEntity> call, Response<MyTaskEntity> response) {
                MyTaskEntity entity = response.body();

//                if(entity != null && entity.getSuccess()) {
//                    if(entity != null && !entity.getMsg().isEmpty()){
//                    binding.dialog.setVisibility(View.GONE);
//                    binding.etNote.setText("");
//                    Toast.makeText(getApplication(), ""+entity.getMsg(), Toast.LENGTH_LONG).show();
//                    }
//                }else{
//                    Toast.makeText(getApplication(), ""+entity.getMsg(), Toast.LENGTH_LONG).show();
//                }

                if (entity != null && !entity.getMsg().isEmpty()) {
                    binding.dialog.setVisibility(View.GONE);
                    binding.etNote.setText("");
                    Toast.makeText(getApplication(), "" + entity.getMsg(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<MyTaskEntity> call, Throwable t) {
                Toast.makeText(getApplication(), "eroor", Toast.LENGTH_LONG).show();
            }
        });
    }

    public String taskid;

    public void openDialog(String taskid) {
        binding.dialog.setVisibility(View.VISIBLE);
        this.taskid = taskid;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nik, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //  if (id == R.id.action_privacy) {
        //    Intent intent=new Intent(Intent.ACTION_SEND);
        //    String[] recipients={"a.shyamindus@gmail.com"};
        //   intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        //  intent.putExtra(Intent.EXTRA_SUBJECT,"APP ISSUE");
        //  intent.setType("text/html");
        //  startActivity(Intent.createChooser(intent, "Send mail"));
        //  return true;

        //  }
        if (id == R.id.action_settings) {

//            sessionManager.logoutUser();
//            presencesUtility.logout();
         //   Intent i = new Intent(getApplication(), Login_Page.class);
         //   startActivity(i);
         //   finish();
         //   return true;
            SharedPresence.clearpreferences(getApplication());
            SharedPresence.setIsLogin(getApplication(),false);
            Intent intent = new Intent(Home_Page.this, Login_Page.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();

            return true;

        }

        return super.onOptionsItemSelected(item);
    }

}