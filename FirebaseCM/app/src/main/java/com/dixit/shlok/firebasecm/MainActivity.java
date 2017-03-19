package com.dixit.shlok.firebasecm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static com.dixit.shlok.firebasecm.R.id.tokenDetails;

public class MainActivity extends AppCompatActivity {

   String TAG = "main_token";
    TextView tokenDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tokenDetails = (TextView) findViewById(R.id.tokenDetails);
        tokenDetails.setText(sharedPreferences.getInstance(this).getToken());
        Log.d(TAG,sharedPreferences.getInstance(this).getToken());

    }
}
//eCILDcCkvf8:APA91bGQr9axpWrvcNOX0OiZXzzpBy2EPboDVUXOS66xInkDzboMp3Js1PvkUy6vWK-mFkeJk08GBragNY6DSsEkOuv7Vk2xErrjUmVFhcC21Q4X-JBztICIbmzDVxNH-q1f34SRI9-b