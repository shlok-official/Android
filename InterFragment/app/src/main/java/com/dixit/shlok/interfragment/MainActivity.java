package com.dixit.shlok.interfragment;


import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentB f2 = (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);
        f2.changeData(data);
    }
}
