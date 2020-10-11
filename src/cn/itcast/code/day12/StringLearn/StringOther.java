package cn.itcast.code.day12.StringLearn;
/*
 String类的其他功能
        String replace(char old,char new)
        String replace(String old,String new)
        去除字符串两空格
        String trim()
        按字典顺序比较两个字符串
        int compareTo(String str)
        int compareToIgnoreCase(String str)
 */

public class StringOther {
    public static void main(String[] args) {

        String s = "  hello  world  ";
        String ss = s.replace('l','k');
        System.out.println(ss);
        System.out.println("---------");

        String sss = s.replace("owo","ak47");
        System.out.println(sss);
        System.out.println("---------");

        String s2 = s.trim();
        System.out.println(s2);
        System.out.println("---------");

        String s3 = "hello";
        String s4 = "hello";
        String s5 = "Hello";
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareToIgnoreCase(s5));





    }
}
