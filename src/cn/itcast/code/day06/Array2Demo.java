package cn.itcast.code.day06;

public class Array2Demo {

    public static void main(String[] args) {
        /*
        格式一：定义一个二维数组  静态的数组矩形
         */

        int[] [] arr2 = new int[3][2];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("----");
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);

        System.out.println("------");

        /*
        格式二：定义一个二维数组  动态的
         */

        int [] [] arr3 = new int[3][];

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("------");


        arr3[0] =  new int [3];
        arr3[1] = new int[5];
        arr3[2] = new int[4];

        System.out.println(arr3[0][0]);
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0][2]);

        System.out.println("------");
        arr3[1][3] = 100;
        System.out.println(arr3[1][3]);

        /*
        格式三：数据类型[] [] 变量名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...}}
         */

        int [] [] arr4 = {{1,2,3},{2,3,4,5},{2,3}};
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        System.out.println("-------");

        System.out.println(arr4[0][0]);
        System.out.println(arr4[0][1]);
        System.out.println(arr4[0][2]);
        System.out.println("-------");

        System.out.println(arr4[1][0]);
        System.out.println("-------");
        System.out.println(arr4[2][0]);


    }
}
