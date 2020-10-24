package cn.itcast.code.day14.BigIntegerLearn;

/*
    BigInteger类概述
        可以让超过Integer范围内的数据进行运算
    构造方法
        public BigInteger(String val)

    BigInteger类成员方法
        public BigInteger add(BigInteger val)
        public BigInteger subtract(BigInteger val)
        public BigInteger multiply(BigInteger val)
        public BigInteger divide(BigInteger val)
        public BigInteger[] divideAndRemainder(BigInteger val)


 */

import java.math.BigInteger;

public class BigIntegerLearn {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        System.out.println(i);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //NumberFormatException
        //Integer ii = new Integer("2147483648");
        //System.out.println(ii);

        BigInteger bi = new BigInteger("2147483648");
        System.out.println(bi);

        BigInteger bi_1 = new BigInteger("2147483648");
        BigInteger bi_2 = new BigInteger("2147483648");
        BigInteger res_1_1 = bi_1.add(bi_2);
        System.out.println(res_1_1);
        BigInteger res_2_2 = bi_1.multiply(bi_2);
        System.out.println(res_2_2);

        BigInteger res_3_3 = bi_1.multiply(bi_2);
        System.out.println(res_3_3);

        BigInteger res_4_4 = bi_1.divide(bi_2);
        System.out.println(res_4_4);

        BigInteger[] res_5_5 = bi_1.divideAndRemainder(bi_2);
        System.out.println("商:" + res_5_5[0]);
        System.out.println("余数:" + res_5_5[0]);








    }
}
