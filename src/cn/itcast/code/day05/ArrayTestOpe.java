package cn.itcast.code.day05;
/*
1:数组遍历
2:获取最值
3:数组逆序
 */

public class ArrayTestOpe {

    public static void main(String[] args) {
        String [] name = {"su", "wang", "zhang", "chen"};

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

        int [] age = {18, 20, 33, 30, 33,21};

        int  max = age[0];
        for(int i=1;i<age.length;i++){
            if(age[i]>max){
                max = age[i];
            }
        }

        System.out.println(max);

        //调用方法
        int result = getMax(age);
        System.out.println(result);

        //调用翻转
        getReverse(age);
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }

    }

    //获取最大值写成方法
    /*
    两个明确
        1：明确返回值类型
        2：明确参数列表
     */

    public static int getMax(int [] arr){
        int  max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void getReverse(int [] arr){
       /* int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] =temp;*/

        for (int x=0; x<arr.length/2;x++){
            int temp = arr[x];
            arr[x] = arr[arr.length-1-x];
            arr[arr.length-1-x] = temp;
        }
    }
}
