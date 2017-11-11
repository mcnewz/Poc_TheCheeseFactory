package com.mcnew.mvcstructure3;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Administrator on 2/9/2016.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

    }
}
