package com.example.xiamuyao.test;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Android on 2017/3/30.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
