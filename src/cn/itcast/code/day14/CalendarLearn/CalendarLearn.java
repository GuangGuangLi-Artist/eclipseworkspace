package cn.itcast.code.day14.CalendarLearn;
/*
   Calendar类概述
        Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
    成员方法
        public static Calendar getInstance() 使用默认时区和语言环境获得一个日历。返回的 Calendar 基于当前时间，使用了默认时区和默认语言环境。
        public int get(int field) 返回给定日历字段的值
        public void add(int field,int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量
        public final void set(int year,int month,int date) 将给定的日历字段设置为给定值

 */

import java.util.Calendar;

public class CalendarLearn {
    public static void main(String[] args) {


        System.out.println(Calendar.getInstance());
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int mon = c.get(Calendar.MONTH);
        System.out.println(mon);

        int day = c.get(Calendar.DATE);
        System.out.println(day);

        //三年前的今天
        System.out.println("三年前的今天");
        c.add(Calendar.YEAR,-3);

        year = c.get(Calendar.YEAR);
        System.out.println(year);

        mon = c.get(Calendar.MONTH);
        System.out.println(mon);

        day = c.get(Calendar.DATE);
        System.out.println(day);
        System.out.println("-----------");

        c.set(2011,11,11);

        year = c.get(Calendar.YEAR);
        System.out.println(year);

        mon = c.get(Calendar.MONTH);
        System.out.println(mon);

        day = c.get(Calendar.DATE);
        System.out.println(day);

    }
}
