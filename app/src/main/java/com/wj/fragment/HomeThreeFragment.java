package com.wj.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gyf.barlibrary.ImmersionBar;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.wj.myproj.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/6.
 */

public class HomeThreeFragment extends Fragment {

    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private TwinklingRefreshLayout refreshLayout;
    private int bannerHeight;
    private View headView;
    private View view;
    private List<String> mImages = new ArrayList<>();
    private List<String> mItemList = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_homepage, null);
        initView();
        initData();
        setEvents();
        ImmersionBar.setTitleBar(getActivity(), mToolbar);
        return view;
    }

    private void initView() {
        mToolbar = view.findViewById(R.id.toolbar);
        mRecyclerView = view.findViewById(R.id.rv);
        refreshLayout = view.findViewById(R.id.refreshLayout);

    }

    private void initData() {
        for (int i = 1; i <= 20; i++) {
            mItemList.add("item" + i);
        }
        mImages.add("http://desk.zol.com.cn/showpic/1024x768_63850_14.html");
        mImages.add("http://desk.zol.com.cn/showpic/1024x768_63850_14.html");
        mImages.add("http://desk.zol.com.cn/showpic/1024x768_63850_14.html");
        mImages.add("http://desk.zol.com.cn/showpic/1024x768_63850_14.html");
    }

    private void setEvents() {

    }
}
