package com.tjnu.xuan.smartphone.entity;

/*
 *  项目名：  com.tjnu.xuan.smartphone.entity
 *  包名：    SmartPhone
 *  文件名:   CourierData
 *  创建者:   happy_yuxuan
 *  创建时间:  17/6/20 下午2:46
 *  描述：    快递查询实体
 */
public class CourierData {

    //时间
    private String datetime;
    //状态
    private String remark;
    //城市
    private String zone;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "CourierData{" +
                "datetime='" + datetime + '\'' +
                ", remark='" + remark + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }
}
