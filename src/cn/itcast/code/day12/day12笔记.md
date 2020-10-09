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
            