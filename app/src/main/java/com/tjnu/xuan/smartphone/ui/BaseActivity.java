package com.tjnu.xuan.smartphone.ui;

/*
 *  项目名：  com.tjnu.xuan.smartphone.ui
 *  包名：    SmartPhone
 *  文件名:   BaseActivity
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午2:13
 *  描述：    Activity基类
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setElevation(0);
        //显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
