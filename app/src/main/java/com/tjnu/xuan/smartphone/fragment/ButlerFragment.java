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
 *  文件名:   ButlerFragment
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午2:26
 *  描述：    机器人服务
 */

public class ButlerFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butler, null);

        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
