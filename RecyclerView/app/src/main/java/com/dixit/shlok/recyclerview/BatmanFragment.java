package com.dixit.shlok.recyclerview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ShlokDixit on 3/22/17.
 */

public class BatmanFragment extends Fragment {
    private RecyclerView recyclerViewBatsy;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout =  inflater.inflate(R.layout.batman,container,false);
        recyclerViewBatsy = (RecyclerView) layout.findViewById(R.id.batmanFragment);
        return layout;
    }
}
