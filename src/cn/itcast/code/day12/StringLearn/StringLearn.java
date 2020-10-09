package cn.itcast.code.day12.StringLearn;
/*
字符串的本质是字符数组
    构造方法
    public String() 空构造
    public String(byte[] bytes) 把字节数组转成字符串
    public String(byte[] bytes,int offset,int length) 把字节数组的一部分转化成字符串
    public String(char[] value) 把字符数组转成字符串
    public String(char[] value,int offset,int count) 把字符数组的一部分转成字符串
    public String(String original) 把字符串常量转换成字符串

    字符串的方法
        public int length()

    字符串的值一旦被赋值，就不能被改变，是指值不能被改变，不是引用不能变


 */
public class StringLearn {
    public static void main(String[] args) {

        String s = new String();
        System.out.println("s" + s + "s.length()" + s.length());
        System.out.println("----");

        byte [] bys = {97,98,99,100,101,102};
        String s2 = new String(bys);
        System.out.println(s2);
        String s3 = new String(bys,2,3);
        System.out.println(s3);

        System.out.println("------");

        char [] chs = {'x','y','z','爱','中','国'};

        String s4 = new String(chs);
        System.out.println(s4);
        String s5 = new String(chs,2,4);
        System.out.println(s5);

        System.out.println("-----");

        String s6 = new String("abcde");
        System.out.println(s6);

        System.out.println("--------");

        String s7 = "Hello";
        s7 += " World";
        System.out.println(s7);




    }
}
