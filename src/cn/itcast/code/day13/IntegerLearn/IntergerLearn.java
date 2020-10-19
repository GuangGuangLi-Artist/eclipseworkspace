package cn.itcast.code.day13.IntegerLearn;
/*
    Integer的构造方法
        public Integer(int value)
        public Integer(String s)

     int类型和String类型的相互转换
        int – String
        String – int
 */

public class IntergerLearn {
    public static void main(String[] args) {

        int i = 100;

        System.out.println("i的二进制： " + Integer.toBinaryString(i));
        System.out.println("i的八进制： " + Integer.toOctalString(i));
        System.out.println("i的十六进制： " + Integer.toHexString(i));
        System.out.println("int类型的最大值： " + Integer.MAX_VALUE);
        System.out.println("int类型的最小值： " + Integer.MIN_VALUE);
        System.out.println("----------");

        Integer ii = new Integer(110);
        System.out.println("ii: " + ii);

        String s = "150";
        Integer iii = new Integer(s);
        System.out.println("iii: " + iii);

        //int – String 转化
        int num = 300;
        //方法一
        String s1 = "" + num;
        System.out.println("s1: " + s1);

        //方法二  推荐方法
        String s2 = String.valueOf(num);
        System.out.println("s2: " + s2);

        //方法三  int ---Interger -- String
        Integer i_4 = new Integer(num);
        String s3 = i_4.toString();
        System.out.println("s3: " + s3);

        //方式四  public static String toString(int i) 返回一个表示指定整数的 String 对象
        String s4 = Integer.toString(num);
        System.out.println("s4: " + s4);

        //String – int 转化
        String s5 = "2000";

        //方式一 String  -- Integer -- int
        //public int intValue()
        Integer i_5 = new Integer(s5);
        int x  = i_5.intValue();
        System.out.println("x: " + x);

        //方式二 public static int parseInt(String s,int radix)throws NumberFormatException
        int y = Integer.parseInt(s5);
        System.out.println("y: " + y);








    }
}
