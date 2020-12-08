package cn.itcast.code.day22.IOLearn;
/*
    标准输入输出流
    System类中的两个成员变量：
	public static final InputStream in “标准”输入流。
	public static final PrintStream out “标准”输出流。

	InputStream is = System.in;
	PrintStream ps = System.out;
 */

import java.io.PrintStream;

public class SystemLearn {
    public static void main(String[] args) {

        System.out.println("hello");


        PrintStream ps = System.out;
        ps.println("world");

        //PrintStream 没有print方法
        //System.out.print();

    }
}
