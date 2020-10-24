package cn.itcast.code.day14.DateFormatLearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class DateUtil {
    private DateUtil(){

    }

    /**
     *
     * @param d
     *              被转化的日期对象
     * @param format
     *              传递过来的日期格式
     * @return
     *              格式化的字符串
     */
    public static String dateToString(Date d, String format){

        return new SimpleDateFormat(format).format(d);
    }


    /**
     *
     * @param s  被解析的字符串
     * @param foemat  传递过来要被转换的格式
     * @return   解析后的日期对象
     * @throws ParseException
     */
    public  static Date  stringToDate(String s,String foemat) throws ParseException {

        return new SimpleDateFormat(foemat).parse(s);
    }


}
