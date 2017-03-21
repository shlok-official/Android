package com.dixit.shlok.sharedpref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText UserName;
    EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName = (EditText) findViewById(R.id.userName);
        Password = (EditText) findViewById(R.id.password);
    }

    public void save(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username",UserName.getText().toString());
        editor.putString("password",Password.getText().toString());
        editor.commit();

        Toast.makeText(this,"Data Saved",Toast.LENGTH_LONG).show();

    }

    public void gotob(View view){
        Intent intent = new Intent(this,ActivityB.class);
        startActivity(intent);

    }


}
