### System类下有一个静态的字段
    public static final InputStream in：“标准”输入流，此流对应于键盘输入或者由主机环境或用户指定的另一个输入源
    InputStream is = System.in

```java
class Demo{
    public static final int x = 10;
    public static final Student s = new Student();
    }
int y = Demo.x;
Student s = Demo.s;
```


    public Scanner(InputStream source):构造一个新的 Scanner，它生成的值是从指定的输入流扫描的。取自该流的字节通过底层平台的默认字符集转换成字符。

    基本格式
        public boolean hasNextXxx():判断是否是某种类型的元素
        public Xxx nextXxx():获取该元素
    常见方法：
        public String nextLine():获取一个字符串类型
        public int nextInt()：获取一个int类型
    先获取int,再获取字符串会出现问题
        原因：将enter按照"\r\n"处理
        如何解决：
            A:先获取一个数值后，再创建一个新的键盘录入对象获取字符串
            B:把所有的数据都先按照字符串获取，然后按照想要的类型进行转化
### String 类的判断功能
    字符串的判断功能
            boolean equals(Object obj)：  比较字符串的内容是否相同，区分大小写
            boolean equalsIgnoreCase(String str)： 比较字符串的内容是否相同，不区分大小写
            boolean contains(String str)：判断大字符串是否包含小字符串
            boolean startsWith(String str)：判断字符串是否以某一个指定的字符串开头
            boolean endsWith(String str)：判断字符串是否以某一个指定的字符串结尾
            boolean isEmpty()：判断字符串是否为空
       注意：内容为空和字符串对象为空 String s = "", String s1 = null;
 
### String 类的获取功能
    String类的获取功能
        int length()：获取字符串的长度
        char charAt(int index)：获取指定索引位置的字符
        int indexOf(int ch)：返回指定字符在此字符串中第一次出现处的索引。
        int indexOf(String str)： 返回指定子字符串在此字符串中第一次出现处的索引。
        int indexOf(int ch,int fromIndex)：返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
        int indexOf(String str,int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        String substring(int start)：返回一个新的字符串，它是此字符串的一个子字符串。默认到末尾，包含start这个索引
        String substring(int start,int end)： 返回一个新字符串，它是此字符串的一个子字符串。包括start索引但是不包括end索引
        
### String 类的转换功能
    String类的转换功能
        byte[] getBytes():把字符串转换为字节数组
        char[] toCharArray()：把字符串转换为字符数组
        static String valueOf(char[] chs)： 把字符数组转成字符串
        static String valueOf(int i)：把int转换成字符串 可以转换任何类型
        String toLowerCase()：把字符串转成小写
        String toUpperCase()：把字符串转成大写
        String concat(String str)：把字符串拼接 

### String类的其他功能
    String类的其他功能
        String replace(char old,char new)
        String replace(String old,String new)
        去除字符串两空格	
        String trim()
        按字典顺序比较两个字符串  
        int compareTo(String str)
        int compareToIgnoreCase(String str) 
                           