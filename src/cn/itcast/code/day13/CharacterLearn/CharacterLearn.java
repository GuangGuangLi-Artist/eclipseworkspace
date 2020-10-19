package cn.itcast.code.day13.CharacterLearn;
/*
    Character 类在对象中包装一个基本类型 char 的值
    此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然
    构造方法
        public Character(char value)
    成员方法
        public static boolean isUpperCase(char ch)
        public static boolean isLowerCase(char ch)
        public static boolean isDigit(char ch)
        public static char toUpperCase(char ch)
        public static char toLowerCase(char ch)




 */

public class CharacterLearn {
    public static void main(String[] args) {
        Character ch = new Character('a');
        System.out.println("ch:" + ch);

        //public static boolean isUpperCase(char ch)
        System.out.println("isUpperCase:" + Character.isUpperCase('A'));
        System.out.println("-----");

        //public static boolean isLowerCase(char ch)
        System.out.println("isLowerCase:" + Character.isLowerCase('a'));
        System.out.println("-----");

        //public static boolean isDigit(char ch)
        System.out.println("isDigit:" + Character.isDigit('0'));
        System.out.println("-----");

        //public static char toUpperCase(char ch)
        System.out.println("toUpperCase:" + Character.toUpperCase('A'));
        System.out.println("toUpperCase:" + Character.toUpperCase('a'));
        System.out.println("-----");

        //public static char toLowerCase(char ch)
        System.out.println("toLowerCase:" + Character.toLowerCase('A'));
        System.out.println("toLowerCase:" + Character.toLowerCase('a'));
        System.out.println("-----");

        /*
               统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)

         */

        int bigCount = 0;
        int samllCount = 0;
        int numCount = 0;

        String s = "HelloWorld123";

        char [] chs = s.toCharArray();
        for (int i = 0; i <chs.length ; i++) {
            char ch1 = chs[i];

            //判断
            if(Character.isUpperCase(ch1)){
                bigCount++;
            }else if(Character.isLowerCase(ch1)){
                samllCount++;
            }else if(Character.isDigit(ch1)){
                numCount++;
            }
        }

        System.out.println("大写的个数:" + bigCount);
        System.out.println("小写的个数:" + samllCount);
        System.out.println("数字的个数:" + numCount);








    }
}
