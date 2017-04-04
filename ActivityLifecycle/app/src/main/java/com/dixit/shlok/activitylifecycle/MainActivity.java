package com.dixit.shlok.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv = (TextView) findViewById(R.id.tv);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MAIN ACTIVITY","OnCreate() called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        tv.setText("OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tv.setText("OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tv.setText("OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        tv.setText("OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv.setText("OnDestroy()");
    }





}
