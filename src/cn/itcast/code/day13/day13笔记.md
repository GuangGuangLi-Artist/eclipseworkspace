### StringBuffer
    StringBuffer和String的区别
        前者长度和内容可变，后者不可变
        如果使用前者做字符串的拼接，不会浪费太多的资源
    构造方法
        public StringBuffer() ：无参构造方法
        public StringBuffer(int capacity):指定容量的字符串缓冲区对象
        public StringBuffer(String str)：指定字符串内容的字符串缓冲区对象
    成员方法
        public int capacity()：返回当前容量，理论值
        public int length()： 返回长度（字符数），实际值

    添加功能
        public StringBuffer append(String str) :可以把任意类型的数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
        public StringBuffer insert(int offset,String str)可以把任意类型的数据添加到字符串缓冲区里面，可以指定位置，并返回字符串缓冲区本身
    删除功能
        public StringBuffer deleteCharAt(int index):删除指定位置的字符并返回本身
        public StringBuffer delete(int start,int end)：删除指定位置的字符,包左不包右
    替换功能
        public StringBuffer replace(int start,int end,String str):从start开始到end,用str替换
    反转功能
        public StringBuffer reverse()
    截取功能
        public String substring(int start):
        public String substring(int start,int end)
    截取功能和前面几个功能的不同
        返回值类型是String类型，本身没有发生改变
        
    面试题
        String StringBuffer StringBuilder的区别
            String是可变的 StringBuffer StringBuilder是不可变的
            StringBuffer是同步的，数据安全，效率低 StringBuilder是不同步的，数据不安全，效率高
        StringBuffer 和 数组 的区别
            二者都可以看成是容器，装其他的数据，StringBuffer的数据最终是一个字符串数据，而数组可以放置多种数据，但必须是同一种数据类型的
        形式参数问题
        String：
        StringBuffer
        形式参数
            基本类型：形式参数的改变不影响实际参数
            引用类型：形式参数的改变直接影响实际参数
        注意：
            String作为形式参数传递，效果和基本类型作为参数传递时一样的
  
### 数组高级
    冒泡排序：
        相邻元素两两比较，大的往后放，第一次完毕后，最大值就出现在了最大索引处，同理，继续，即可的大宋一个排好序的数组
        规律：
            两两比较，大的放后
            每一次比较后，下一次比较的时候就会减少一个元素的比较
            第一次比较，有0个元素不比，第二次比较，有1个元素不比...
            总共比较 (lengh - 1)次 
    选择排序：
        从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
        规律：
            第一次是从0索引开始和其他的进行比较
            第二次是从1索引开始和其他的进行比较
            ...
            最后一次是（数组的长度 - 2） 的元素和（数组的长度 - 1） 的元素比较
    基本查找：数组元素无序（从头找到尾）
    二分查找（折半查找）：数组元素有序
        思想：每次都猜中间的那个元素，比较大或者小，就能减少一半的元素
        思路：
            定义最小最大索引
            计算出中间索引
            拿中间索引的值和要查找的元素进行比较
                相等：就直接返回当前的中间索引
                不等：
                    大了：在左边找
                    小了：在右边找
            重新获取最小索引或者最大索引
                大了 在左边找
                    max = mid - 1
                小了  在右边找
                     min = mid + 1
            再次计算中间索引
        注意：
            因为数组本身是无序的，所以这种情况下不能使用二分查找
            因为先排序会改变数组原来的索引顺序，所以查找不准确
### arrays的使用
    针对数组进行操作的工具类，比如排序和查找
    public static int binarySearch(int[] a,int key)：二分查找
    public static void sort(int[] a)：对指定的 int 型数组按数字升序进行排序
    public static String toString(boolean[] a)：返回指定数组内容的字符串表示形式。

### 基本类型的包装类
    public static final int MAX_VALUE 表示 int 类型能够表示的最大值
    public static final int MIN_VALUE 表示 int 类型能够表示的最小值
    public static String toBinaryString(int i) 以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。
    public static String toHexString(int i) 以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。
    public static String toOctalString(int i) 以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。
        为了对基本数据类型进行更多的操作，java就针对每一种基本数据类型提供了对应的类型，称为包装类类型
        byte   Byte
        short   Short
        int     Integer
        long    Long
        float   Float
        double  Double
        char    Character
        boolean  Boolean
    常用的操作之一：用于基本数据类型与字符串之间的转换
    Integer的构造方法
        public Integer(int value)
        public Integer(String s)
        注意：这个字符串必须由数字组成
    int类型和String类型的相互转换
        int – String
        A:String -- int
            Integer.parseInt("100");
        B:int -- String
        	String.valueOf(100);
 ```java
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

        
 ```       
        String – int  常用public static int parseInt(String s,int radix)
```java
        String s5 = "2000";

        //方式一 String  -- Integer -- int
        //public int intValue()
        Integer i_5 = new Integer(s5);
        int x  = i_5.intValue();
        System.out.println("x: " + x);

        //方式二 public static int parseInt(String s,int radix)throws NumberFormatException
        int y = Integer.parseInt(s5);
        System.out.println("y: " + y);
```        

       进制转化
       常用的基本进制转换
       public static String toBinaryString(int i)
       public static String toOctalString(int i)
       public static String toHexString(int i)
       十进制到其他进制   进制的范围  2 - 36   （0-9） + （a-z）
       public static String toString(int i,int radix)
       其他进制到十进制
       public static int parseInt(String s,int radix)
### 自动包装和拆箱
    包装和拆箱
         自动装箱：把基本类型转化为包装类类型
         自动拆箱：把包装类类型转化为基本类型
         注意：
            在使用时，Integer  x = null;上面的代码就会出现NullPointerException。

### Character的使用
     Character 类在对象中包装一个基本类型 char 的值
        此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然
        构造方法
            public Character(char value)
        成员方法
            public static boolean isUpperCase(char ch)
            public static boolean isLowerCase(char ch)
            public static boolean isDigit(char ch)
            public static char toUpperCase(char ch)
            public static char toLowerCase(char ch)                   


                            
                    
            
                    
                    
          