package com.wj.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wj.myproj.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/6.
 */

public class MainListViewApapter extends BaseAdapter {

    private List<String> mItemList = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public void setmItemList(List<String> mItemList) {
        this.mItemList = mItemList;
    }

    public MainListViewApapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            view = inflater.inflate(R.layout.item_main, null);
            viewHolder = new ViewHolder();
            viewHolder.items = (TextView) view.findViewById(R.id.textView);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.items.setText(mItemList.get(position));
        return view;
    }

    class ViewHolder {
        TextView items;
    }
}
