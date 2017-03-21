package com.dixit.shlok.sharedpref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {
    public static final String DEFAULT="N/A";
    TextView getUserName,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        getUserName = (TextView) findViewById(R.id.userName2);
        getPassword = (TextView) findViewById(R.id.password2);
    }

    public void load(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("username",DEFAULT);
        String pass = sharedPreferences.getString("password",DEFAULT);

        if(name.equals(DEFAULT) == pass.equals(DEFAULT)){
            Toast.makeText(this,"No Data Available",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Data Loaded Successfully",Toast.LENGTH_LONG).show();
            getUserName.setText(name);
            getPassword.setText(pass);
        }
    }

    public void previous(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

}
