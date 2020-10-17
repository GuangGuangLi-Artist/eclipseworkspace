package cn.itcast.code.day13.StringBufferLearn;
/*
    我们讲解类之间的转换
    把A类转化为B类
        可能是为了使用B类的方法
    把B类转化为A类
        我们要的结果可能是a类型，所以还得转回来
 */

public class StringBufferTest {
    public static void main(String[] args) {


        //将String 转化为StringBuffer
        //构造方法
        String s = "hello";
        StringBuffer sb = new StringBuffer(s);

        //成员方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
        System.out.println("sb: " + sb);
        System.out.println("sb2: " + sb2);
        System.out.println("----------");

        //将StringBuffer转化为String
        StringBuffer sb3 = new StringBuffer("java ");

        //构造方法
        String s3 = new String(sb3);

        //成员方法
        String s4 = sb3.toString();
        System.out.println("s3: " + s3 );
        System.out.println("s4: " + s4);
        System.out.println("----------");

        //把数组拼接成一个字符串
        int [] arr = {1,2,3,4,5};
        String s6 = arrayToString(arr);
        System.out.println("s6: " + s6);
        System.out.println("---------");

        //使用StringBuffer做反转
        String res = myReverse("abcde");
        System.out.println(res);
        System.out.println("---------");

        //字符串是否对称
        boolean b = isSymmetrical("abbba");
        System.out.println(b);
        System.out.println("---------");

        boolean b1 = isSymmetrical2("abcde");
        System.out.println(b1);
        System.out.println("---------");



    }

      /*
        把数组拼接成一个字符串
         */
      public static String arrayToString(int[] arr){
          StringBuffer sb = new StringBuffer();
          sb.append("[");
          for (int i = 0; i < arr.length; i++) {
              if(i == arr.length - 1){
                  sb.append(arr[i]);
              }else {
                  sb.append(arr[i]).append(" ,");
              }

          }
          sb.append("]");
          return sb.toString();
      }

      /*
      把字符串反转

       */

      public static String myReverse(String s){
          StringBuffer sb = new StringBuffer(s);
          return sb.reverse().toString();
      }

      /*
      判断一个字符串是否是对称字符串
            例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串

       */

      //一个个比较
      public static boolean isSymmetrical(String s){
          Boolean flag = true;
          char [] chs = s.toCharArray();
          for (int start = 0, end = chs.length - 1 ; start <= end; start++, end--) {
              if(chs[start] != chs[end]){
                  flag = false;
                  break;
              }

          }
          return flag;
      }

      //使用字符串缓冲区
      public static boolean isSymmetrical2(String s){
          return new StringBuffer(s).reverse().toString().equals(s);
      }




}
