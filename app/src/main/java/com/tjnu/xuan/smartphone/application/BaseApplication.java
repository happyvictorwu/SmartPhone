package com.tjnu.xuan.smartphone.application;

import android.app.Application;

import com.tjnu.xuan.smartphone.utils.StaticClass;

import cn.bmob.v3.Bmob;

/*
 *  项目名：  com.tjnu.xuan.smartphone.application
 *  包名：    SmartPhone
 *  文件名:   BaseApplication
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午2:10
 *  描述：    Application 所有的Application都是基于这个的加了Bmob的Key
 */
public class BaseApplication extends Application {

    //创建
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Bmob
        Bmob.initialize(this, StaticClass.BMOB_APP_ID);

    }
}
