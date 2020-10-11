package cn.itcast.code.day12.StringLearn;

/*
String类的转换功能
    byte[] getBytes():把字符串转换为字节数组
    char[] toCharArray()：把字符串转换为字符数组
    static String valueOf(char[] chs)： 把字符数组转成字符串
    static String valueOf(int i)：把int转换成字符串 可以转换任何类型
    String toLowerCase()：把字符串转成小写
    String toUpperCase()：把字符串转成大写
    String concat(String str)：把字符串拼接

 */

public class StringConversion {
    public static void main(String[] args) {
        String s = "JavaSE";

        //byte[] getBytes():把字符串转换为字节数组
        byte[] bys = s.getBytes();
        for(int x =0;x<bys.length;x++){
            System.out.println(bys[x]);
        }
        System.out.println("-------------");

        //char[] toCharArray()：把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for(int x =0;x<chs.length;x++){
            System.out.println(chs[x]);
        }
        System.out.println("-------------");

        //static String valueOf(char[] chs)： 把字符数组转成字符串
        String ss = String.valueOf(chs);
        System.out.println(ss);
        System.out.println("-------------");

        //static String valueOf(int i)：把int转换成字符串 可以转换任何类型
        String sss = String.valueOf(100);
        System.out.println(sss);
        System.out.println("-------------");

        //String toLowerCase()：把字符串转成小写
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println("-------------");
        //String toUpperCase()：把字符串转成大写
        System.out.println(s.toUpperCase());
        System.out.println("-------------");

        //String concat(String str)：把字符串拼接
        String s2 = "hello ";
        String s3 = s2.concat(s);
        System.out.println(s3);
        System.out.println("-------------");

        /*
        把字符串的首字母转换成大写
         */
        String res = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(res);










    }
}
