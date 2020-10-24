package cn.itcast.code.day14.BigDecimalLearn;

/*
    BigDecimal
        由于在运算的时候，float类型和double很容易丢失精度，演示案例。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
    BigDecimal类概述
        不可变的、任意精度的有符号十进制数。
    构造方法
        public BigDecimal(String val)

    成员方法
        public BigDecimal add(BigDecimal augend)
        public BigDecimal subtract(BigDecimal subtrahend)
        public BigDecimal multiply(BigDecimal multiplicand)
        public BigDecimal divide(BigDecimal divisor)
        public BigDecimal divide(BigDecimal divisor,int scale,
             int roundingMode) divisor - 此 BigDecimal 要除以的值。scale - 要返回的 BigDecimal 商的标度。  roundingMode - 要应用的舍入模式。

 */

import java.math.BigDecimal;

public class BigDecimalLearn {
    public static void main(String[] args) {
        BigDecimal bd_1 = new BigDecimal("0.09");
        BigDecimal bd_2 = new BigDecimal("0.01");

        BigDecimal res_1_1 = bd_1.add(bd_2);
        System.out.println(res_1_1);

        BigDecimal res_2_2 = bd_1.divide(bd_2,8,BigDecimal.ROUND_HALF_UP);
        System.out.println(res_2_2);

        BigDecimal res_3_3 = bd_1.subtract(bd_2);
        System.out.println(res_3_3);

        BigDecimal res_4_4 = bd_1.multiply(bd_2);
        System.out.println(res_4_4);

        BigDecimal res_5_5 = bd_1.divide(bd_2);
        System.out.println(res_5_5);

    }
}
