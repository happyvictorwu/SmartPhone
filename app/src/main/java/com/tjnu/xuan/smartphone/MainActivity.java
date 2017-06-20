package com.tjnu.xuan.smartphone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.tjnu.xuan.smartphone.fragment.ButlerFragment;
import com.tjnu.xuan.smartphone.fragment.CourierActivity;
import com.tjnu.xuan.smartphone.fragment.UserFragment;
import com.tjnu.xuan.smartphone.fragment.WechatFragment;
import com.tjnu.xuan.smartphone.ui.SettingActivity;

import java.util.ArrayList;
import java.util.List;

/*
 *  项目名：  com.tjnu.xuan.smartphone
 *  包名：    SmartPhone
 *  文件名:   CustomDialog
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午5:05
 *  描述：    主界面
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //TabLayout
    private TabLayout mTabLayout;
    //ViewPager
    private ViewPager mViewPager;
    //Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment> mFragment;
    //悬浮窗
    private FloatingActionButton fab_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //去掉阴影
        getSupportActionBar().setElevation(0);

        initData();
        initView();
    }

    private void initData() {
        mTitle = new ArrayList<>();
        boolean add = mTitle.add(getString(R.string.text_butler_service));
        mTitle.add(getString(R.string.text_wechat));
        mTitle.add(getString(R.string.text_express_query));
        mTitle.add(getString(R.string.text_user_info));

        mFragment = new ArrayList<>();
        mFragment.add(new ButlerFragment());
        mFragment.add(new WechatFragment());
        mFragment.add(new CourierActivity());
        mFragment.add(new UserFragment());
    }

    private void initView() {
        fab_setting = (FloatingActionButton) findViewById(R.id.fab_setting);
        fab_setting.setOnClickListener(this);

        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());

        fab_setting.setVisibility(View.GONE);
        //mViewPager滑动监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.i("TAG", "position:" + position);
                if (position == 0) {
                    fab_setting.setVisibility(View.GONE);
                } else {
                    fab_setting.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            //返回item的个数
            @Override
            public int getCount() {
                return mFragment.size();
            }

            //设置标题
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        //绑定
        mTabLayout.setupWithViewPager(mViewPager);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_setting:
                startActivity(new Intent(this, SettingActivity.class));
                break;
        }
    }
}
