package cn.itcast.code.day12.StringLearn;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        /*
        把数组中的数据按照指定个格式拼接成一个字符串
            举例：int[] arr = {1,2,3};	输出结果：[1, 2, 3]

         */
        int[] arr = {1,2,3};

        String s = "";

        s += "[";
        for (int i = 0; i <arr.length ; i++) {
            if(i==arr.length-1){
                s+=arr[i];
                s+="]";
            }else {
                s+=arr[i];
                s+=", ";
            }

        }
        System.out.println(s);
        String res1 = getReverseres("abc");
        System.out.println(res1);

        System.out.println("----");
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String minString = "java";
        int cou = getCount(maxString,minString);
        System.out.println(cou);



    }

       /*
        字符串反转
                    举例：键盘录入”abc”		输出结果：”cba”

         */

    public static String getReverseres(String line){
        String res = "";
        char [] chs = line.toCharArray();
        for (int x=chs.length-1;x>=0;x--) {
            res += chs[x];

        }
        return res;

    }
    /*
    统计大串中小串出现的次数
    举例：在字符串” woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”中java出现了5次
     */

    public static int getCount(String maxString,String minString){

        int count = 0;

        int index = maxString.indexOf(minString);

        while (index != -1){
            count ++;

            int startIndex = index + minString.length();
            maxString = maxString.substring(startIndex);

            index = maxString.indexOf(minString);
        }

        return count;
    }



}
