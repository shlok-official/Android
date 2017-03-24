package com.dixit.shlok.recyclerview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by ShlokDixit on three/22/17.
 */

public class SupermanFragment extends Fragment {
    private RecyclerView recyclerViewSups;
    private Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout =  inflater.inflate(R.layout.superman,container,false);
        recyclerViewSups = (RecyclerView) layout.findViewById(R.id.supermanFragment);
        adapter = new Adapter(getActivity(),getData());
        recyclerViewSups.setAdapter(adapter);
        getData();
        recyclerViewSups.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;
    }
    public static List<information> getData(){
        List<information> data = new ArrayList<>();
        int[] icons ={R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four};
        String[] titles ={"Text one","Text two","Text three","Text four"};
        for(int i =0 ; i< titles.length && i< icons.length ;i++){
            information current = new information();
            current.iconId = icons[i];
            current.title = titles[i];
            data.add(current);
        }return data;
    }
}
