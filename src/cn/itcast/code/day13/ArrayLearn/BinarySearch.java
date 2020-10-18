package cn.itcast.code.day13.ArrayLearn;


public class BinarySearch {

    public static void main(String[] args) {
        //定义一个数组
        int arr [] = {11,22,33,44,55,66,77};

        //使用方法
        int res = getIndex(arr,33);
        System.out.println("res: " + res);

        //如果查找的值不存在
        int res1 = getIndex(arr,333);
        System.out.println("res1: " + res1);

        /*
        在数组中查找元素
            int [] arr = {24, 69, 80, 57, 13}

            先排序后查找

            注意：
                因为数组本身是无序的，所以这种情况下不能使用二分查找
                因为先排序会改变数组原来的索引顺序，所以查找不准确
         */
        System.out.println("------------");
        int [] arr3 = {24, 69, 80, 57, 13};

        //排序
        ArrayLearn.bubbleSort(arr3);

        //查找
        int res3 = getIndex(arr3,69);
        System.out.println("res3: " + res3);







    }

     public static int getIndex(int[] arr,int value){

        //定义最小最大索引
         int max = arr.length - 1;
         int min = 0;

         //计算出中间索引
         int mid = (max + min) / 2;

         //拿中间索引的值和要查找的元素进行比较
         while (arr[mid] != value){
             if(arr[mid] > value){
                 //左边查找
                 max = mid - 1;
             }else if(arr[mid] < value) {
                 //右边找
                 min = mid + 1;
             }

             //加入判断
             if(min > max){
                 return -1;
             }

             //再次计算中间索引
             mid = (max + min) / 2;
         }

         //相等：就直接返回当前的中间索引
         return mid;
     }
}
