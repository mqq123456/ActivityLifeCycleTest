package com.heqinuc.activitylifecycletest;

import android.content.Intent;
import android.nfc.Tag;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            String tempData = savedInstanceState.getString("data_key");
            Log.d("DUG", tempData);
        }
        Button normal = (Button)findViewById(R.id.start_normal_activity);
        Button dialog = (Button)findViewById(R.id.start_dialog_activity);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NormalActivvity.class);
                startActivity(intent);
            }
        });
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        String tempData = "Someting you just typed";
        outState.putString("data_key",tempData);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DUG", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DUG", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DUG", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DUG", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DUG", "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DUG", "onRestart: ");
    }
}
