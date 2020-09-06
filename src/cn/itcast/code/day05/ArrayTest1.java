package cn.itcast.code.day05;

public class ArrayTest1 {

    public static void main(String[] args) {

        //动态初始化
        int[] arr_1 = new int[3];
        arr_1[0] = 100;
        arr_1[2] = 300;

        //静态初始化
        int[] age = {18, 20, 40};

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("-------");

        for (int i = 0; i < arr_1.length; i++) {
            System.out.println(arr_1[i]);
        }

        //数组操作的常见异常
        int[] arr_2 = {1, 2, 3};
        //ArrayIndexOutOfBoundsException
        //System.out.println(arr_2[3]);

        arr_2 = null;
        //NullPointerException
        //System.out.println(arr_2[0]);

    }
}
