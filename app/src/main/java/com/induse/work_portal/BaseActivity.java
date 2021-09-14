package com.induse.work_portal;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.induse.work_portal.retrofit.ServicesInterface;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    public ServicesInterface myApi = ServicesInterface.create();

    public  SharedPresencesUtility presencesUtility ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presencesUtility =  SharedPresencesUtility.getInstance(this);
    }

    @Override
    public void onClick(View v) {

    }


    void init(){}

    void listener(){}

}
