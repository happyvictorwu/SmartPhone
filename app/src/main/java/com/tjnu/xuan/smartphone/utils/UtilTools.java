package com.tjnu.xuan.smartphone.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/*
 *  项目名：  com.tjnu.xuan.smartphone.utils
 *  包名：    SmartPhone
 *  文件名:   UtilTools
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午2:20
 *  描述：    工具统一类
 */
public class UtilTools {

    //设置字体
    public static void setFont(Context mContext, TextView textview) {
        Typeface fontType = Typeface.createFromAsset(mContext.getAssets(), "fonts/FONT.TTF");
        textview.setTypeface(fontType);
    }

}
