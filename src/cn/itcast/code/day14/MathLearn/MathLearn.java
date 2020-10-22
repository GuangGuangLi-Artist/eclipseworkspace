package cn.itcast.code.day14.MathLearn;
/*
    Math
        Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数
        public static int abs(int a):绝对值
        public static double ceil(double a)：向上取整
        public static double floor(double a)：向下取整
        public static int max(int a,int b) min自学：最大值最小值
        public static double pow(double a,double b)：a的b次幂
        public static double random()：随机数
        public static int round(float a) 参数为double的自学 四舍五入
        public static double sqrt(double a)：正平方根

 */

public class MathLearn {
    public static void main(String[] args) {
        int x = -20;
        System.out.println(Math.abs(x));

        System.out.println("PI:" + Math.PI);
        System.out.println("E:" + Math.E);
        System.out.println(Math.ceil(123.45));
        System.out.println(Math.floor(0.023));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.random());
        System.out.println(Math.round(23.25f));
        System.out.println(Math.sqrt(9.9));
        System.out.println("Max:" + Math.max(Math.max(12,34),Math.max(35,78)));
        System.out.println("random:" + ((int)(Math.random() * 100) + 1));


    }
}
