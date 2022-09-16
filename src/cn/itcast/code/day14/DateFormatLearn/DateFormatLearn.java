package cn.itcast.code.day14.DateFormatLearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    DateFormat
    DateFormat类概述
        DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
        是抽象类，所以使用其子类SimpleDateFormat
    SimpleDateFormat构造方法
        public SimpleDateFormat()  默认格式
        public SimpleDateFormat(String pattern)  给定模式
    成员方法
        public final String format(Date date)
        public Date parse(String source)

 */
public class DateFormatLearn {
    public static void main(String[] args) throws ParseException {

        //Date -- String  格式化
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat();
        System.out.println(sf);

        String s = sf.format(d);
        System.out.println(s);

        SimpleDateFormat sf_1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sf_1);
        String ss = sf_1.format(d);
        System.out.println(ss);


        //String -- Date  解析
        String sss = "2020-10-24 23-39-34";
        SimpleDateFormat sf_2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date dd = sf_2.parse(sss);
        System.out.println(dd);


    }
}
