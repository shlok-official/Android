package com.dixit.shlok.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by ShlokDixit on 3/22/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private final LayoutInflater inflator;
    List<information> data = Collections.emptyList();
    public Adapter(Context context, List<information> data) {
         inflator = LayoutInflater.from(context);
         this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.custom_row,parent,false);
        //First we inflate the layout and then pass this to the
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        information current = data.get(position);
        holder.title.setText(current.getTitle());
        holder.photo.setImageResource(current.getIconId());

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView photo;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            photo = (ImageView) itemView.findViewById(R.id.listIcon);
        }
    }
}
