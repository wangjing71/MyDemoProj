package com.wj.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

import com.wj.fragment.CategoryThreeFragment;
import com.wj.fragment.HomeThreeFragment;
import com.wj.fragment.MineThreeFragment;
import com.wj.fragment.ServiceThreeFragment;
import com.wj.myproj.R;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ViewPager mViewPager;
    private LinearLayout ll_home;
    private LinearLayout ll_category;
    private LinearLayout ll_service;
    private LinearLayout ll_mine;
    private ArrayList<Fragment> mFragments;



    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mViewPager = findViewById(R.id.viewPager);
        ll_home = findViewById(R.id.ll_home);
        ll_category = findViewById(R.id.ll_category);
        ll_service = findViewById(R.id.ll_service);
        ll_mine = findViewById(R.id.ll_mine);



    }

    @Override
    protected void initData() {
        mFragments = new ArrayList<>();
        HomeThreeFragment homeThreeFragment = new HomeThreeFragment();
        CategoryThreeFragment categoryThreeFragment = new CategoryThreeFragment();
        ServiceThreeFragment serviceThreeFragment = new ServiceThreeFragment();
        MineThreeFragment mineThreeFragment = new MineThreeFragment();
        mFragments.add(homeThreeFragment);
        mFragments.add(categoryThreeFragment);
        mFragments.add(serviceThreeFragment);
        mFragments.add(mineThreeFragment);

        mViewPager.setAdapter(new MyHomeViewPagerAdapter(getSupportFragmentManager()));
        mViewPager.setOffscreenPageLimit(3);
        ll_home.setSelected(true);
    }

    @Override
    protected void setEvent() {
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        tabSelected(ll_home);
                        mImmersionBar.statusBarDarkFont(false).navigationBarColor(R.color.colorPrimary).init();
                        break;
                    case 1:
                        tabSelected(ll_category);
                        mImmersionBar.statusBarDarkFont(true, 0.2f).navigationBarColor(R.color.btn3).init();
                        break;
                    case 2:
                        tabSelected(ll_service);
                        mImmersionBar.statusBarDarkFont(false).navigationBarColor(R.color.btn13).init();
                        break;
                    case 3:
                        tabSelected(ll_mine);
                        mImmersionBar.statusBarDarkFont(true).navigationBarColor(R.color.btn1).init();
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager.setCurrentItem(0);
                tabSelected(ll_home);
            }
        });
        ll_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager.setCurrentItem(1);
                tabSelected(ll_category);
            }
        });
        ll_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager.setCurrentItem(2);
                tabSelected(ll_service);
            }
        });
        ll_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager.setCurrentItem(3);
                tabSelected(ll_mine);
            }
        });
    }

    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
        mImmersionBar.keyboardEnable(true).navigationBarColor(R.color.colorPrimary).navigationBarWithKitkatEnable(false).init();
    }

    private void tabSelected(LinearLayout linearLayout) {
        ll_home.setSelected(false);
        ll_category.setSelected(false);
        ll_service.setSelected(false);
        ll_mine.setSelected(false);
        linearLayout.setSelected(true);
    }

    private class MyHomeViewPagerAdapter extends FragmentPagerAdapter {
        MyHomeViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
    }
}
