package cn.itcast.code.day12.StringLearn;

public class StringTest {
    public static void main(String[] args) {

        /*
        把数组中的数据按照指定个格式拼接成一个字符串
            举例：int[] arr = {1,2,3};	输出结果：[1, 2, 3]

         */
        int[] arr = {1,2,3};

        String s = "";

        s += "[";
        for (int i = 0; i <arr.length ; i++) {
            if(i==arr.length-1){
                s+=arr[i];
                s+="]";
            }else {
                s+=arr[i];
                s+=", ";
            }

        }
        System.out.println(s);
    }
}
