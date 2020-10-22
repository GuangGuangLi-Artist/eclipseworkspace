package cn.itcast.code.day14.MathLearn;
/*
    Random类概述
        此类用于产生随机数
        如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
    构造方法
        public Random():默认种子，是当前时间的毫秒值
        public Random(long seed)：给出指定的种子

        给定种子后，每次得到的随机数是相同的
    成员方法
        public int nextInt()
        public int nextInt(int n)




 */

import java.util.Random;

public class RandomLearn {
    public static void main(String[] args) {
        //Random  r = new Random();
        Random  r = new Random(1111);
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100) + 1;
            System.out.println(num);

        }


    }
}
