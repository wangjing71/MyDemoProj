package com.wj.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.gyf.barlibrary.ImmersionBar;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.wj.myproj.R;

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

    }

    private void setEvents() {

    }
}
