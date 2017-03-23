package com.dixit.shlok.recyclerview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by ShlokDixit on 3/22/17.
 */

public class SupermanFragment extends Fragment {
    private RecyclerView recyclerViewSups;
    private Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout =  inflater.inflate(R.layout.superman,container,false);
        recyclerViewSups = (RecyclerView) layout.findViewById(R.id.supermanFragment);

        return layout;
    }
    public static void getData(){
        List<information> data = new ArrayList<>();
        int[] icons ={R.drawable.1, R.drawable.2, R.drawable.3, R.drawable.4};
        String[] titles ={"Text 1","Text 2","Text 3","Text 4"};
        for(int i =0 ; i< titles.length;i++){
            information current = new information();
            current.getIconId() = icons[i];
        }
    }
}
