package com.tjnu.xuan.smartphone.entity;

/*
 *  项目名：  com.tjnu.xuan.smartphone.entity
 *  包名：    SmartPhone
 *  文件名:   ChatListData
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/20 下午3:07
 *  描述：    机器人对话列表的实体
 */
public class ChatListData {

    //type
    private int type;
    //文本
    private String text;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

