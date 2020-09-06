package cn.itcast.code;
/*
键盘例如两个数，返回两个数中的最大值

 */

import java.util.Scanner;
public class FunctionTestMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();

        int result = get_max(a,b);
        System.out.println("较大的值是: " + result);



    }
    public static int get_max(int a,int b){
        //if语句
      /*  if(a > b){
            return a;
        }else {
            return b;
        }*/

      //三元运算符
        int c = ((a > b) ? a : b);

        return c;

    }
}
