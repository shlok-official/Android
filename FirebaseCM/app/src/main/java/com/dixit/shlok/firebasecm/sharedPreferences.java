package com.dixit.shlok.firebasecm;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ShlokDixit on 3/18/17.
 */

public class sharedPreferences {
    private static final String SHARED_PREFERENCE = "FCM_sharedPref";
    private static final String KEY_TOKEN = "FCM_KEY";

    private static Context ctx;
    private  static sharedPreferences spinstance;


    private sharedPreferences(Context context){
        ctx = context;
    }

    public static synchronized sharedPreferences getInstance(Context context){
        if(spinstance == null)
            spinstance=new sharedPreferences(context);
        return spinstance;
    }

    public boolean storeToken(String token){
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(SHARED_PREFERENCE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_TOKEN,token);
        editor.apply();
        return  true;
    }

    public String getToken(){
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(SHARED_PREFERENCE, Context.MODE_PRIVATE);
       return sharedPreferences.getString(KEY_TOKEN,null);
    }

}
