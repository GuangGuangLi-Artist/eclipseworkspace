package cn.itcast.code.day05;


/*

方法重载
		在同一个类中，方法名相同，参数列表不同。与返回值无关。

		参数列表不同：
			参数的个数不同。
			参数的对应的数据类型不同。
比较两个数据是否相等，参数类型分别为
    两个byte类型，两个short类型，两个int类型，两个long类型
 */

public class FunctionTestChongZai {
    public static void main(String[] args) {
        byte b1 = 'a';
        byte b2 = 'b';
        System.out.println("byte:" + compare(b1,b2));

        short s1 = 5;
        short s2 = 5;
        System.out.println("short:" + compare(s1,s2));


    }


    //byte类型
    public static Boolean compare(byte a, byte b){
        System.out.println("byte");

        return a == b;
    }

    //byte类型
    public static Boolean compare(short a, short b){
        System.out.println("short");
        return a == b;
    }

    //byte类型
    public static Boolean compare(int a, int b){
        System.out.println("int");
        return a == b;
    }

    //byte类型
    public static Boolean compare(long a, long b){
        System.out.println("long");
        return a == b;
    }


}
