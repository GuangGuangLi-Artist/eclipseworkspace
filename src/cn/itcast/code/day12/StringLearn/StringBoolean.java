package cn.itcast.code.day12.StringLearn;
/*
字符串的判断功能
        boolean equals(Object obj)：  比较字符串的内容是否相同，区分大小写
        boolean equalsIgnoreCase(String str)： 比较字符串的内容是否相同，不区分大小写
        boolean contains(String str)：判断大字符串是否包含小字符串
        boolean startsWith(String str)：判断字符串是否以某一个指定的字符串开头
        boolean endsWith(String str)：判断字符串是否以某一个指定的字符串结尾
        boolean isEmpty()：判断字符串是否为空
   注意：内容为空和字符串对象为空 String s = "", String s1 = null;
 */

public class StringBoolean {
    public static void main(String[] args) {

        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "helloWorld";

        //boolean equals(Object obj)：  比较字符串的内容是否相同，区分大小写
        System.out.println("equals:" + s1.equals(s2));
        System.out.println("equals:" + s1.equals(s3));
        System.out.println("------");

        //boolean equalsIgnoreCase(Object obj)：  比较字符串的内容是否相同，不区分大小写
        System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s2));
        System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s3));
        System.out.println("------");

        //boolean contains(String str)：判断大字符串是否包含小字符串
        System.out.println("contains:" + s1.contains("hello"));
        System.out.println("contains:" + s1.contains("huawei"));
        System.out.println("------");

        //boolean startsWith(String str)：判断字符串是否以某一个指定的字符串开头
        System.out.println("startsWith:" + s1.startsWith("hello"));
        System.out.println("startsWith:" + s1.startsWith("ho"));
        System.out.println("------");

        //boolean isEmpty()：判断字符串是否为空

        String s4 = "";
        String s5 = null;

        System.out.println("isEmpty:" + s4.isEmpty());
        //NullPointerException
        //System.out.println("isEmpty:" + s5.isEmpty());









    }
}
