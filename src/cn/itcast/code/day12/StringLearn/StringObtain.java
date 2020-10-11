package cn.itcast.code.day12.StringLearn;
/*
    String类的获取功能
    int length()：获取字符串的长度
    char charAt(int index)：获取指定索引位置的字符
    int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
    int indexOf(String str)： 返回指定子字符串在此字符串中第一次出现处的索引。
    int indexOf(int ch,int fromIndex)：返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
    int indexOf(String str,int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
    String substring(int start)：返回一个新的字符串，它是此字符串的一个子字符串。默认到末尾，包含start这个索引
    String substring(int start,int end)： 返回一个新字符串，它是此字符串的一个子字符串。包括start索引但是不包括end索引

 */

public class StringObtain {

    public static void main(String[] args) {
        String s = "helloworld";

        //int length()：获取字符串的长度
        System.out.println("s.length: " + s.length());
        System.out.println("------------");

        //char charAt(int index)：获取指定索引位置的字符
        System.out.println("s.charAt: " + s.charAt(4));
        System.out.println("------------");

        //int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
        System.out.println("s.indexOf: " + s.indexOf('l'));
        System.out.println("------------");

        //int indexOf(String str)： 返回指定子字符串在此字符串中第一次出现处的索引。
        System.out.println("s.indexOf: " + s.indexOf("ow"));
        System.out.println("------------");

        //int indexOf(int ch,int fromIndex)：返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
        System.out.println("s.indexOf: " + s.indexOf('l',4));
        System.out.println("------------");

        //int indexOf(String str,int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        System.out.println("s.indexOf: " + s.indexOf("ow",2));
        System.out.println("------------");

        //String substring(int start)：返回一个新的字符串，它是此字符串的一个子字符串。
        System.out.println("s.substring: " + s.substring(5));
        System.out.println("------------");

        //String substring(int start,int end)： 返回一个新字符串，它是此字符串的一个子字符串。包括start索引但是不包括end索引
        System.out.println("s.substring: " + s.substring(0,s.length()));
        System.out.println("------------");

        /*
        遍历获取字符串的每一个字符
         */
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }


        /*统计一个字符串中的大小写和数字的个数，
        如Hello123World

         */
        String s2 = "Hello123World";

        int numCount = 0;
        int bigCount = 0;
        int smallCount = 0;

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(ch>'0' && ch<'9'){
                numCount++;
            }else if(ch>'a' && ch<'z'){
                smallCount++;
            }else{
                bigCount++;
            }
        }
        System.out.println("大写字母的个数是: " + bigCount);
        System.out.println("小写字母的个数是: " + smallCount);
        System.out.println("数字的个数是: " + numCount);





    }



}
