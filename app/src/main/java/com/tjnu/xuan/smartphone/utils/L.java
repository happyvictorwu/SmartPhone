package com.tjnu.xuan.smartphone.utils;

import android.util.Log;

/*
 *  项目名：  com.tjnu.xuan.smartphone.utils
 *  包名：    SmartPhone
 *  文件名:   L
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午2:21
 *  描述：    Log封装类
 */
public class L {

    //开关
    public static final  boolean DEBUG = true;
    //TAG
    public static final String TAG = "Smartbutler";

    //五个等级  DIWE

    public static void d(String text){
        if(DEBUG){
            Log.d(TAG,text);
        }
    }

    public static void i(String text){
        if(DEBUG){
            Log.i(TAG,text);
        }
    }

    public static void w(String text){
        if(DEBUG){
            Log.w(TAG,text);
        }
    }

    public static void e(String text){
        if(DEBUG){
            Log.e(TAG,text);
        }
    }
}
