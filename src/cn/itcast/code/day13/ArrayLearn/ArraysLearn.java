package cn.itcast.code.day13.ArrayLearn;

import java.util.Arrays;

/*
    针对数组进行操作的工具类，比如排序和查找
    public static int binarySearch(int[] a,int key)：二分查找
    public static void sort(int[] a)：对指定的 int 型数组按数字升序进行排序
    public static String toString(boolean[] a)：返回指定数组内容的字符串表示形式。
 */
public class ArraysLearn {
    public static void main(String[] args) {
        int [] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前： "  + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后： " + Arrays.toString(arr));
    //二分查找的前提是要对数组进行排序
        System.out.println("binarySearch: " + Arrays.binarySearch(arr,80));
        System.out.println("binarySearch: " + Arrays.binarySearch(arr,577));
    }

}
