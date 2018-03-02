package com.wj.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.barlibrary.ImmersionBar;
import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.wj.activity.MainActivity;
import com.wj.adapter.OneAdapter;
import com.wj.library.zxing.android.CaptureActivity;
import com.wj.myproj.R;
import com.wj.utils.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2018/1/6.
 */

public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";
    private Toolbar mToolbar;
    private RecyclerView mRv;
    private TwinklingRefreshLayout refreshLayout;
    private View view;
    private List<String> mImages = new ArrayList<>();
    private List<String> mItemList = new ArrayList<>();
    private View headView;
    private int bannerHeight;
    private OneAdapter mOneAdapter;
    private LinearLayout scane;
    private final int  CAMERA_CODE= 2;
    private static final int REQUEST_CODE_SCAN = 0x0000;

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
        mRv = view.findViewById(R.id.rv);
        refreshLayout = view.findViewById(R.id.refreshLayout);
        scane = mToolbar.findViewById(R.id.scane);

    }

    private void initData() {
        for (int i = 1; i <= 20; i++) {
            mItemList.add("item" + i);
        }

        mImages.add("https://i0.hdslb.com/bfs/archive/0ba8778a85cd73a63eb370a94e7e3ac411af6a62.jpg");
        mImages.add("https://i0.hdslb.com/bfs/archive/ee67e09c57283388b3189cbc00ed7f845b1b05f6.jpg@620w_220h.webp");
        mImages.add("https://i0.hdslb.com/bfs/archive/21a158779754ad35e7834150b5fc226acb2fa2c6.jpg@620w_220h.webp");
        mImages.add("https://i0.hdslb.com/bfs/bangumi/4076c659f1c6b8dba89f30ac8cbb5f3a79119a77.jpg_620x300.jpg");
        mImages.add("https://i0.hdslb.com/bfs/bangumi/33e17831b61ff7b37bd91c0d7cc99864445254ed.jpg_620x300.jpg");
        mImages.add("https://i0.hdslb.com/bfs/bangumi/aba3e44ce6fd97f06a10b7ffaa2a3edd1bc186a3.jpg_620x300.jpg");
        mImages.add("https://i0.hdslb.com/bfs/bangumi/41a0132df9c4cb028fd33669717a99488c88ee24.jpg_620x300.jpg");

        refreshLayout.setEnableLoadmore(false);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false);
        mRv.setLayoutManager(linearLayoutManager);
        mOneAdapter = new OneAdapter();
        mOneAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        mRv.setAdapter(mOneAdapter);
        addHeaderView();
        mOneAdapter.setPreLoadNumber(1);
        mOneAdapter.setNewData(mItemList);


    }

    private void setEvents() {
        scane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED) {
                    Log.i("====", "申请权限");
                    HomeFragment.this.requestPermissions(new String[]{Manifest.permission.CAMERA},
                            CAMERA_CODE);
                } else {
                    Log.i("====", "权限存在");
                    Intent intent = new Intent(getContext(),
                            CaptureActivity.class);
                    startActivityForResult(intent, REQUEST_CODE_SCAN);
                }


            }
        });

        mRv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            private int totalDy = 0;

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                totalDy += dy;
                if (totalDy <= bannerHeight) {
                    float alpha = (float) totalDy / bannerHeight;
                    mToolbar.setBackgroundColor(ColorUtils.blendARGB(Color.TRANSPARENT
                            , ContextCompat.getColor(getActivity(), R.color.colorPrimary), alpha));
                } else {
                    mToolbar.setBackgroundColor(ColorUtils.blendARGB(Color.TRANSPARENT
                            , ContextCompat.getColor(getActivity() , R.color.colorPrimary), 1));
                }
            }
        });
        mOneAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mOneAdapter.addData(addData());
                        if (mItemList.size() == 100) {
                            mOneAdapter.loadMoreEnd();
                        } else
                            mOneAdapter.loadMoreComplete();
                    }
                }, 2000);
            }
        }, mRv);
        refreshLayout.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onRefresh(final TwinklingRefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mItemList.clear();
                        mItemList.addAll(newData());
                        mOneAdapter.setNewData(mItemList);
                        refreshLayout.finishRefreshing();
                        mToolbar.setVisibility(View.VISIBLE);
                    }
                }, 2000);
            }

            @Override
            public void onPullingDown(TwinklingRefreshLayout refreshLayout, float fraction) {
                mToolbar.setVisibility(View.GONE);
            }

            @Override
            public void onPullDownReleasing(TwinklingRefreshLayout refreshLayout, float fraction) {
                if (Math.abs(fraction - 1.0f) > 0) {
                    mToolbar.setVisibility(View.VISIBLE);
                } else {
                    mToolbar.setVisibility(View.GONE);
                }
            }
        });
    }

    private void addHeaderView() {
        if (mImages != null && mImages.size() > 0) {
            headView = LayoutInflater.from(getActivity()).inflate(R.layout.item_banner, (ViewGroup) mRv.getParent(), false);
            Banner banner = (Banner) headView.findViewById(R.id.banner);
            banner.setImages(mImages)
                    .setImageLoader(new GlideImageLoader())
                    .setDelayTime(5000)
                    .start();
            mOneAdapter.addHeaderView(headView);
            ViewGroup.LayoutParams bannerParams = banner.getLayoutParams();
            ViewGroup.LayoutParams titleBarParams = mToolbar.getLayoutParams();
            bannerHeight = bannerParams.height - titleBarParams.height - ImmersionBar.getStatusBarHeight(getActivity());
        }
    }

    private List<String> addData() {
        List<String> data = new ArrayList<>();
        for (int i = mItemList.size() + 1; i <= mItemList.size() + 20; i++) {
            data.add("item" + i);
        }
        return data;
    }

    private List<String> newData() {
        List<String> data = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            data.add("item" + i);
        }
        return data;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Intent intent = new Intent(getContext(),
                        CaptureActivity.class);
                startActivityForResult(intent, REQUEST_CODE_SCAN);
            } else {
                Toast.makeText(getContext(), "拒绝了权限申请", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
