package com.wj.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gyf.barlibrary.ImmersionBar;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.wj.adapter.MainListViewApapter;
import com.wj.myproj.R;
import com.wj.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/6.
 */

public class HomeThreeFragment extends Fragment {

    private Toolbar mToolbar;
    private ListView mListView;
    private TwinklingRefreshLayout refreshLayout;
    private View view;
    private List<String> mImages = new ArrayList<>();
    private List<String> mItemList = new ArrayList<>();
    private MainListViewApapter adapter;
    private View headView;
    private int bannerHeight;

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
        mListView = view.findViewById(R.id.mlistview);
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

        adapter = new MainListViewApapter(getContext());
        adapter.setmItemList(mItemList);
        mListView.setAdapter(adapter);

        if (mImages != null && mImages.size() > 0) {
            headView = LayoutInflater.from(getActivity()).inflate(R.layout.item_banner, (ViewGroup) mListView.getParent(), false);
            Banner banner = (Banner) headView.findViewById(R.id.banner);
            banner.setImages(mImages)
                    .setImageLoader(new GlideImageLoader())
                    .setDelayTime(5000)
                    .start();
            mListView.addHeaderView(headView);
            ViewGroup.LayoutParams bannerParams = banner.getLayoutParams();
            ViewGroup.LayoutParams titleBarParams = mToolbar.getLayoutParams();
            bannerHeight = bannerParams.height - titleBarParams.height - ImmersionBar.getStatusBarHeight(getActivity());
        }

    }

    private void setEvents() {

    }
}
