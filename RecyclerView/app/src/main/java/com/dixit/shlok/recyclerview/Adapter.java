package com.dixit.shlok.recyclerview;

import android.content.Context;
import android.content.Intent;
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
 * Created by ShlokDixit on three/22/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private LayoutInflater inflator;
    private Context context;
    //private ClickListenerCustom clickListenerCustom;

    List<information> data = Collections.emptyList();

    public Adapter(Context context, List<information> data) {
         this.context = context;
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
        holder.title.setText(current.title);
        holder.photo.setImageResource(current.iconId);

    }

//    public void setClickListenerCustom(ClickListenerCustom clickListenerCustom){
//    this.clickListenerCustom = clickListenerCustom;
//    }

    @Override
    public int getItemCount() {
        return data.size();
    }
//Viewholder class

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView photo;

//view holder constructor
        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.listText);
            photo = (ImageView) itemView.findViewById(R.id.listIcon);
        }

        @Override
        public void onClick(View view) {
            context.startActivity(new Intent(context,MainActivity.class));


        }
    }
//    public interface ClickListenerCustom{
//        public void ItemClickedCustom(View view,int position);
//    }
}
