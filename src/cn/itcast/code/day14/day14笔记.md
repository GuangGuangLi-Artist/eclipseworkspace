### 正则表达式
    正则表达式
            满足某种规则的一个字符串
            校验qq号码.
    		1:要求必须是5-15位数字
    		2:0不能开头
        正则表达式规则：
            字符：
                x  字符 x  'a'表示字符a
                \\ 反斜线字符
                \n 新行（换行）符 ('\u000A')
                \r 回车符 ('\u000D')
            字符类：
                [abc] a、b 或 c（简单类）
                [^abc] 任何字符，除了 a、b 或 c（否定）
                [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） [0-9] 0到9的字符到包括
            预定义字符类：
                . 任何字符（与行结束符可能匹配也可能不匹配） .本身使用\.
                \d 数字：[0-9]
                \D 非数字： [^0-9]
                \s 空白字符：[ \t\n\x0B\f\r]
                \w 单词字符：[a-zA-Z_0-9]  再正则表达式里面组成单词的东西必须有这些东西组成
            边界匹配器：
                ^ 行的开头
                $ 行的结尾
                \b 单词边界 就是不是单词字符的地方 hello world?haha;xixi
            数量词：
                X? X，一次或一次也没有
                X* X，零次或多次
                X+ X，一次或多次
                X{n} X，恰好 n 次
                X{n,} X，至少 n 次
                X{n,m} X，至少 n 次，但是不超过 m 次
        正则表达式的应用
            判断功能
                public boolean matches(String regex) 编译给定正则表达式并尝试将给定输入与其匹配。
            分割功能
                public String[] split(String regex) 围绕此模式的匹配拆分给定输入序列
            替换功能
                public String replaceAll(String regex,String replacement)  使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
            获取功能
                Pattern和Matcher类的使用
                    public boolean find() 尝试查找与该模式匹配的输入序列的下一个子序列。
                    
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
                
        System类概述
                System 类包含一些有用的类字段和方法。它不能被实例化。
            成员方法
                public static void gc()//运行垃圾回收器。
                public static void exit(int status) 终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
                public static long currentTimeMillis()  返回以毫秒为单位的当前时间。
                public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
        
        