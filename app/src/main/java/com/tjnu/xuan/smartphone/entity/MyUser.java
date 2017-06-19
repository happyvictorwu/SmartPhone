package com.tjnu.xuan.smartphone.entity;

/*
 *  项目名：  com.tjnu.xuan.smartphone.entity
 *  包名：    SmartPhone
 *  文件名:   MyUser
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/19 下午4:28
 *  描述：    用户属性
 */
import cn.bmob.v3.BmobUser;

public class MyUser extends BmobUser{

    private int age;
    private boolean sex;
    private String desc;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}