package com.induse.work_portal;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class Login_Page extends BaseActivity {
    EditText ed_empid,ed_emppass;
    ImageView showpass;
    Button bt_login;
    SharedPresence shared;
    SessionManager sessionManager;
    CheckBox  chk_pass;
   // SharedPresencesUtility presencesUtility;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
         // shared =  SharedPresence.getInstance(this);
       // shared =  SharedPresence.getInstance(getApplication());
        sessionManager = new SessionManager(getApplicationContext());
        bt_login = findViewById(R.id.btnlogin);
        ed_empid = findViewById(R.id.emaillogin);
        ed_emppass = findViewById(R.id.passlogin);
        showpass = findViewById(R.id.iv);
        chk_pass = findViewById(R.id.chk_pass);
        chk_pass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    // show password
                    ed_emppass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    // hide password
                    ed_emppass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ed_empid.getText().toString().isEmpty())
                {
                    Toast.makeText(Login_Page.this, "fill Email", Toast.LENGTH_SHORT).show();
                    return;
                }if (ed_empid.getText().toString().length()<4)
                {
                    Toast.makeText(Login_Page.this, "enter valid Id", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(ed_emppass.getText().toString().isEmpty())
                {
                    Toast.makeText(Login_Page.this, "Fill password", Toast.LENGTH_SHORT).show();
                }else if(ed_emppass.getText().toString().length()<2)

                {
                    Toast.makeText(Login_Page.this, "enter valid Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(!Connectivity.isConnected(getApplicationContext()))
                {
                    Toast.makeText(Login_Page.this, "no internet connection", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    loginuser();
                }

            }

        });
    }

    public void loginuser(){
       // showProgressBar();
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://work.sipstech.in/api/login";

        StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {

                          //  hideProgressBar();
                            JSONObject obj = new JSONObject(response);
                            Log.e("Responce", obj.toString());

                            String success = obj.getString("response_code");
                            String respmessage = obj.getString("msg");



                            Log.i("Resp1", success);
                            if (success.equals("200")) {
//comment for login
                               SharedPresence.setIsLogin(Login_Page.this,true);

                                JSONObject heroObject = obj.getJSONObject("data");
                              // String name = heroObject.getString("email");
                                String fullname = heroObject.getString("firstname");
                               String profileImg = heroObject.getString("profile_image");
                              //  String name = heroObject.getString("name");
                              //  String location_id = heroObject.getString("location_id");
                               String id = heroObject.getString("staffid");
                             //  String user_type = heroObject.getString("firstname");
                             // sessionManager.createLoginSession(id, name);
                                presencesUtility.setEmpId(getApplicationContext(),id);
                               presencesUtility.setUserName(getApplicationContext(),fullname);
                                presencesUtility.setimage(getApplicationContext(),profileImg);
                              // sessionManager.createLoginSession(name,id);
                            //    sessionManager.createLoginSession(name,user_type);
                              //  sharedPresence.setLogin(true);
                              //  sharedPresence.setUserName(getApplicationContext(),name);
                              //  sharedPresence.setLocationId(getApplicationContext(),location_id);
                              //  sharedPresence.setUserDesignation(getApplicationContext(),user_type);
                              //  sharedPresence.setId(getApplicationContext(),id);
                               // sharedPresence.setLogin(true);
                                Intent intent = new Intent(Login_Page.this,Home_Page.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                                finish();


                            }
                            else if (success.equals("0"))
                            {
                                Toast.makeText(Login_Page.this, " Invalid Id and Password", Toast.LENGTH_SHORT).show();
                              //  hideProgressBar();

                             //   Snackbar snackbar1 = Snackbar.make(ll_main_layout, respmessage, Snackbar.LENGTH_LONG);
                              //  snackbar1.show();

                            }else {

                               // hideProgressBar();

                               // Snackbar snackbar1 = Snackbar.make(ll_main_layout, respmessage, Snackbar.LENGTH_LONG);
                              //  snackbar1.show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        Log.d("Error.Response", error.toString());
                    }
                }

        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();


                params.put("email",ed_empid.getText().toString());
                params.put("password",ed_emppass.getText().toString());
                // params.put("model",model);

                return params;
            }
        };
        queue.add(postRequest);
        postRequest.setRetryPolicy(new DefaultRetryPolicy(
                5000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

    }
    public void ShowHidePass(View view){

        if(view.getId()==R.id.iv){

            if(ed_emppass.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
              //  ((ImageView(view)).setImageResource(R.drawable.iv);

                //Show Password
                ed_emppass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else{
               // ((ImageView)(view)).setImageResource(R.drawable.iv);

                //Hide Password
                ed_emppass.setTransformationMethod(PasswordTransformationMethod.getInstance());

            }
        }
    }

}