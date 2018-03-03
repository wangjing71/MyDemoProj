package com.wj.adapter;

import android.content.Context;
import android.graphics.Bitmap;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wj.myproj.R;

/**
 * Created by geyifeng on 2017/6/3.
 */

public class OneAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private Context context;
    public OneAdapter(Context context) {
        super(R.layout.item_main);
        this.context = context;
    }


    @Override
    protected void convert(final BaseViewHolder helper, String item) {

        Glide.with( context ) // could be an issue!
                .load(item)
                .asBitmap()   //强制转换Bitmap
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(Bitmap bitmap, GlideAnimation<? super Bitmap> glideAnimation) {
                        helper.setImageBitmap(R.id.text,bitmap);
                    }
                });

    }
}
