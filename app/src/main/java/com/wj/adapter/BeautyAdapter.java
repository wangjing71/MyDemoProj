package com.wj.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wj.myproj.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/3.
 */

public class BeautyAdapter extends RecyclerView.Adapter<BeautyAdapter.ViewHolder>{
    private ArrayList<String> beautys;
    private Context context;

    public void setList(ArrayList<String> beautys){
        this.beautys = beautys;
    }

    public BeautyAdapter(Context context){
        this.context = context;
    }

    @Override
    public BeautyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.beauty_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BeautyAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(beautys.get(position)).into(holder.beauty);
    }

    @Override
    public int getItemCount() {
        return beautys.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView beauty;

        public ViewHolder(View itemView) {
            super(itemView);
            beauty = itemView.findViewById(R.id.imageView);
        }
    }
}
