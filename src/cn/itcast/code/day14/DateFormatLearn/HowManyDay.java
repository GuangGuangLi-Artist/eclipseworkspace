package cn.itcast.code.day14.DateFormatLearn;
/*
    算一下你来到这个世界多少天?
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HowManyDay {

    public static void main(String[] args) throws ParseException {
        //A键盘录入生日
        System.out.println("请输入你的生日，格式为yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        //B把生日转化为日期
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sf.parse(line);


        //C通过日期的大宋一个毫秒值
        long startTime = d.getTime();


        //D获取当前时间的毫秒值
        long endTime = System.currentTimeMillis();

        //E用 D - C 得到一个毫秒值
        long res = endTime - startTime;

        //F把E的值转化为年  1000/60/60/24

        long day = res / 1000 / 60 / 60 / 24;
        System.out.println("你来到这个世界" + day + "天");
    }
}
