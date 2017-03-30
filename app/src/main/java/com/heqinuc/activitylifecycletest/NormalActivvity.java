package com.heqinuc.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NormalActivvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
}
