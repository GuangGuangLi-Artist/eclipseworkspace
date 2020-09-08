package cn.itcast.code.day06;

public class Array2Traversal {

    /*
    二维数组的遍历

    外循环控制二维数组的长度，其实就是一维数组的个数
    内循环控制的是一维数组的长度
     */

    public static void main(String[] args) {
        int [] []  arr2 = {{1,2,3},{3,4,5},{6,7,8}};

        for(int x=0;x<arr2.length;x++){
            for(int y=0;y<arr2[x].length;y++){
                System.out.print(arr2[x][y] + " ");
            }
            System.out.println();
        }


    }
}
