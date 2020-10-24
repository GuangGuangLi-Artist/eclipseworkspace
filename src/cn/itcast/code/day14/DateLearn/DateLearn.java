package cn.itcast.code.day14.DateLearn;
/*
    Date
    Date类概述
        类 Date 表示特定的瞬间，精确到毫秒。
    构造方法
        public Date() 分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
        public Date(long date)  分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
    成员方法
        public long getTime() 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        public void setTime(long time) 设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。

 */

import java.util.Date;

public class DateLearn {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("d:" + d);


        long time = System.currentTimeMillis();
        Date d2 = new Date(time);
        System.out.println("d2:" + d2);

        long time2 = 1000 * 60 * 60;
        Date d3 = new Date(time2);
        System.out.println("d3:" + d3);

        long lg = d.getTime();
        System.out.println(lg);

        d.setTime(1000);
        System.out.println(d);

    }
}
