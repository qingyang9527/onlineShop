package com.hm.onlineshop.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by H&M on 2017/8/11 14:39:12
 */

public class ApplicationUtil extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
        super.onCreate();
    }

    public static  Context getContext(){
        return context;
    }

}
