package com.dixit.shlok.firebasecm;

import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static com.google.android.gms.internal.zzs.TAG;

/**
 * Created by ShlokDixit on 3/18/17.
 */

public class firebaseInstanceID extends FirebaseInstanceIdService {
String TAG = "firebaseInstanceID";
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        storeToken(refreshedToken);
    }
    private void storeToken(String token){
        sharedPreferences.getInstance(getApplicationContext()).storeToken(token);
    }
}
