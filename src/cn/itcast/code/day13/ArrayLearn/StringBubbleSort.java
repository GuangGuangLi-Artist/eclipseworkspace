package cn.itcast.code.day13.ArrayLearn;
 /*
       把字符串中的字符进行排序。
            举例：”dacgebf”
            结果：”abcdefg”

        分析：
            定义一个字符串
            把字符串转化为字符数组
            把字符数组进行排序
            把排序后的字符串转化成字符串
            输出最后的字符串

     */

public class StringBubbleSort {


    public static void main(String[] args) {

        String s = "dacgebf";
        System.out.println("排序前： " + s);

        char [] chs = s.toCharArray();

        stringBubbleSort(chs);

        String res = String.valueOf(chs);

        System.out.println("排序后： " + res);
    }

    public static void stringBubbleSort(char [] chs) {
        for (int x = 0; x < chs.length - 1 ; x++) {
            for (int y = 0; y < chs.length - 1 - x; y++) {

                if (chs[y] > chs[y + 1]){
                    char temp = chs[y];
                    chs[y] = chs[y + 1];
                    chs[y + 1] = temp;
                }

            }
        }

    }
}
