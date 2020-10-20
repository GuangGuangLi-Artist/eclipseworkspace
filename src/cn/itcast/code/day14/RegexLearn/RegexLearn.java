package cn.itcast.code.day14.RegexLearn;
/*
    正则表达式
        满足某种规则的一个字符串
        校验qq号码.
		1:要求必须是5-15位数字
		2:0不能开头
    正则表达式规则：
        字符：
            x  字符 x  'a'表示字符a
            \\ 反斜线字符
            \n 新行（换行）符 ('\u000A')
            \r 回车符 ('\u000D')
        字符类：
            [abc] a、b 或 c（简单类）
            [^abc] 任何字符，除了 a、b 或 c（否定）
            [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） [0-9] 0到9的字符到包括
        预定义字符类：
            . 任何字符（与行结束符可能匹配也可能不匹配） .本身使用\.
            \d 数字：[0-9]
            \D 非数字： [^0-9]
            \s 空白字符：[ \t\n\x0B\f\r]
            \w 单词字符：[a-zA-Z_0-9]  再正则表达式里面组成单词的东西必须有这些东西组成
        边界匹配器：
            ^ 行的开头
            $ 行的结尾
            \b 单词边界 就是不是单词字符的地方 hello world?haha;xixi
        数量词：
            X? X，一次或一次也没有
            X* X，零次或多次
            X+ X，一次或多次
            X{n} X，恰好 n 次
            X{n,} X，至少 n 次
            X{n,m} X，至少 n 次，但是不超过 m 次
    正则表达式的应用
        判断功能
            public boolean matches(String regex) 编译给定正则表达式并尝试将给定输入与其匹配。
        分割功能
            public String[] split(String regex) 围绕此模式的匹配拆分给定输入序列
        替换功能
            public String replaceAll(String regex,String replacement)
        获取功能
            Pattern和Matcher类的使用





 */

import java.util.Arrays;
import java.util.Scanner;

public class RegexLearn {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的qq号码:");
        String qq = sc.nextLine();
        boolean b = checkQQ(qq);
        System.out.println("你的qq号码" + b);*/

        System.out.println("判断功能-----");
        //判断功能：校验电话号码
        boolean b1 = checkMobile("13812345678");
        System.out.println("你的电话号码" + b1);

        //校验邮箱
        boolean b2 = checkailbox("940102659@qq.com");
        System.out.println("你的邮箱" + b1);

        System.out.println("分割功能-----");
        //分割功能：
        /*
            aa,bb,cc
            aa.bb.cc
            aa bb cc
            文件路径
        */
        splitString("aa,bb,cc");
        System.out.println("-------");
        splitString2("E:\\刘意java2015\\day11\\avi\\code");

        /*
        我有如下一个字符串:”91 27 46 38 50”
        请写代码实现最终输出结果是：”27 38 46 50 91”

        定义一个字符串
        把字符串进行分割，得到一个字符串数组
        把字符串数组变换成int数组
        对int数组排序
        把排序后的int数组组装成一个字符串
        输出字符串

         */
        System.out.println("-------");

        String s = "91 27 46 38 50";

        String [] strarr = s.split(" ");

        int [] arr = new int[strarr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strarr[i]);

        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <arr.length ; i++) {
            sb.append(arr[i]).append(" ");
        }

        String res = String.valueOf(sb);
        System.out.println("res: " + res);





    }

    public static boolean checkQQ(String qq){
        return qq.matches("[1-9][0-9]{4,14}");
    }

    public static boolean checkMobile(String mobile){
        return mobile.matches("[1][38]\\d{9}");
    }

    public static boolean checkailbox(String mailbox){
        //return mailbox.matches("[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+");

        return mailbox.matches("\\w+@\\w{2,6}(\\.\\w{2,3})+");

    }

    public static  void splitString(String string_x){

        String [] StringArray = string_x.split(",");
        for (int i = 0; i <StringArray.length ; i++) {
            String  res = StringArray[i];
            System.out.println(res);

        }

    }

    public static  void splitString2(String string_x){

        String [] StringArray = string_x.split("\\\\");
        for (int i = 0; i <StringArray.length ; i++) {
            String  res = StringArray[i];
            System.out.println(res);

        }

    }
}
