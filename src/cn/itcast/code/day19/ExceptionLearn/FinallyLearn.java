package cn.itcast.code.day19.ExceptionLearn;
/*

 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyLearn {
    public static void main(String[] args) {

        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            System.out.println("这里的代码是可以执行的");
        }
        System.out.println(s);

    }
}
