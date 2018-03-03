package com.wj;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * Created by Administrator on 2018/3/3.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initOKGo();

    }

    private void initOKGo() {
        OkGo.getInstance().init(this);
    }
}
