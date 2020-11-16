package cn.itcast.code.day19.ExceptionLearn;
/*

 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompileExceptionLearn {
    public static void main(String[] args) throws ParseException {


        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(s);
    }
}
