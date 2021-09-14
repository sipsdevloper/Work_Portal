package com.induse.work_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sessionManager = new SessionManager(getApplicationContext());
        new Handler().postDelayed(new Runnable() {


            @Override

            public void run() {
                if (SharedPresence.getIsLogin(MainActivity.this)){
                    Intent intent = new Intent(getApplicationContext(),Home_Page.class);
                    startActivity(intent);
                    finish();

                }
                else {
                    Intent intent = new Intent(MainActivity.this, Login_Page.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    MainActivity.this.finish();
                }
//                if (sessionManager.isLoggedIn()){
//                    Intent intent = new Intent(getApplicationContext(),Home_Page.class);
//                    startActivity(intent);
//                    finish();
//
//                }
//                else {
//                    Intent intent = new Intent(MainActivity.this, Login_Page.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//                    startActivity(intent);
//                    MainActivity.this.finish();
//                }

            }

        }, 3*1000);

    }

}


