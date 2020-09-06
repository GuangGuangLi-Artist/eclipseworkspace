package cn.itcast.code;
/*
键盘输入三个数，返回三个数中的最大值

 */
import java.util.Scanner;

public class FunctionTestThreeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数:");
        int c = sc.nextInt();

        int result  = getMaxThree(a,b,c);
        System.out.println("三个数中的最大数是:" + result);

    }

    public static  int getMaxThree(int a, int b, int c){
       /* if(a > b){
            if(a > c){
                return a;
            }else {
                return c;
            }
        }else {
            if(b > c){
                return b;
            }else {
                return c;
            }
        }*/

       //使用三元运算符改进
       /* if(a > b){
            return (a > c) ? a : c;
        }else {
            return (b > c) ? b : c;
        }*/

        //继续改进
        // return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        //方便阅读
        int temp = ((a > b) ? a : b);
        int max = (temp > c ? temp : c);
        return max;

    }
}
