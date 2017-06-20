package com.tjnu.xuan.smartphone.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.tjnu.xuan.smartphone.R;
import com.tjnu.xuan.smartphone.adapter.CourierAdapter;
import com.tjnu.xuan.smartphone.entity.CourierData;
import com.tjnu.xuan.smartphone.utils.L;
import com.tjnu.xuan.smartphone.utils.StaticClass;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  项目名：  com.tjnu.xuan.smartphone.fragment
 *  包名：    SmartPhone
 *  文件名:   CourierActivity
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/20 下午5:29
 *  描述：    快递Fragment(名字错了，做完了才发现，改比较麻烦)
 */
public class CourierActivity extends Fragment implements View.OnClickListener{
    private EditText et_name;
    private EditText et_number;
    private Button btn_get_courier;
    private ListView mListView;

    private List<CourierData> mList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_courier, null);
        findView(view);
        return view;
    }


    //初始化View
    private void findView(View view) {
        et_name = (EditText) view.findViewById(R.id.et_name);
        et_number = (EditText) view.findViewById(R.id.et_number);
        btn_get_courier = (Button) view.findViewById(R.id.btn_get_courier);
        btn_get_courier.setOnClickListener(this);
        mListView = (ListView) view.findViewById(R.id.mListView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_courier:
                /**
                 * 1.获取输入框的内容
                 * 2.判断是否为空
                 * 3.拿到数据去请求数据（Json）
                 * 4.解析Json
                 * 5.listview适配器
                 * 6.实体类（item）
                 * 7.设置数据/显示效果
                 */

                //1.获取输入框的内容
                String name = et_name.getText().toString().trim();
                String number = et_number.getText().toString().trim();

                //拼接我们的url
                String url = "http://v.juhe.cn/exp/index?key=" + StaticClass.COURIER_KEY
                        + "&com=" + name + "&no=" + number;

                //2.判断是否为空
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(number)) {
                    //3.拿到数据去请求数据（Json）
                    RxVolley.get(url, new HttpCallback() {
                        @Override
                        public void onSuccess(String t) {
                            //Toast.makeText(CourierActivity.this, t, Toast.LENGTH_SHORT).show();
                            L.i("Courier:" + t);
                            //4.解析Json
                            parsingJson(t);
                        }
                    });
                } else {
                    Toast.makeText(getActivity(), getString(R.string.text_tost_empty), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    //解析数据
    private void parsingJson(String t) {
        try {
            JSONObject jsonObject = new JSONObject(t);
            JSONObject jsonResult = jsonObject.getJSONObject("result");
            JSONArray jsonArray = jsonResult.getJSONArray("list");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject json = (JSONObject) jsonArray.get(i);

                CourierData data = new CourierData();
                data.setRemark(json.getString("remark"));
                data.setZone(json.getString("zone"));
                data.setDatetime(json.getString("datetime"));
                mList.add(data);
            }
            //倒序
            Collections.reverse(mList);
            CourierAdapter adapter = new CourierAdapter(getActivity(),mList);
            mListView.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
