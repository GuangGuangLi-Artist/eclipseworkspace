package cn.itcast.code.day13.ArrayLearn;

/*
    冒泡排序

 */

public class ArrayLearn {
    public static void main(String[] args) {

        int [] arr = {24, 69, 80, 57, 13};
        System.out.println("冒泡排序");
        System.out.println("-------");
        System.out.println("排序前： ");
        printArray(arr);
        System.out.println("排序后： ");
        bubbleSort(arr);
        printArray(arr);
        System.out.println("----------------------");
        System.out.println("选择排序");
        System.out.println("-------");
        System.out.println("排序前： ");
        printArray(arr);
        System.out.println("排序后： ");
        selectSort(arr);
        printArray(arr);


    }

    //遍历数组
    int [] arr = {24, 69, 80, 57, 13};

    public static void printArray(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("]");
    }

    //冒泡排序
    public static void bubbleSort(int[] array){
        for (int x = 0; x < array.length - 1; x++) {
            for (int y = 0; y < array.length - 1 - x; y++) {
                if(array[y] > array[y + 1]){
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }

            }

        }
    }

    //选择排序
    public static void selectSort(int [] array){
        for (int i = 0; i <array.length -1 ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }

        }
    }




}
