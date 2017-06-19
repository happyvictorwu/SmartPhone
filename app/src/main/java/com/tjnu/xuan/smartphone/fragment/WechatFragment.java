package com.tjnu.xuan.smartphone.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tjnu.xuan.smartphone.R;

/*
 *  项目名：  com.tjnu.xuan.smartphone.fragment
 *  包名：    fragment
 *  文件名:   WechatFragment
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午2:28
 *  描述：    微信精选
 */

public class WechatFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wechat, null);
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
