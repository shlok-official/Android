package com.dixit.shlok.interfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ShlokDixit on 3/19/17.
 */

public class FragmentB extends Fragment {
    TextView tv;
    String data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        if (savedInstanceState == null){}
            else{
                data = savedInstanceState.getString("display");
                TextView myText = (TextView) view.findViewById(R.id.textView);
                myText.setText(data);
            }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) getActivity().findViewById(R.id.textView);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("display",data);
    }
    public void changeData(String data){
        this.data=data;
        tv.setText(data);
    }
}
