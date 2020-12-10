### IO
    OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
    OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
    把字节流转换为字符流。
    字符流 = 字节流 +编码表。
    
    OutputStreamWriter的方法：
    public void write(int c):写一个字符
    public void write(char[] cbuf):写一个字符数组
    public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
    public void write(String str):写一个字符串
    public void write(String str,int off,int len):写一个字符串的一部分
    
    面试题：close()和flush()的区别?
    A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
    B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
    
    InputStreamReader的方法：
    int read():一次读取一个字符
    int read(char[] chs):一次读取一个字符数组
    
    需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
    
    数据源：
    		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader
    目的地：
    		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter
    		
    
    
    由于我们常见的操作都是使用本地默认编码，所以，不用指定编码。
    而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
    OutputStreamWriter = FileOutputStream + 编码表(GBK)
    FileWriter = FileOutputStream + 编码表(GBK)
    
    InputStreamReader = FileInputStream + 编码表(GBK)
    FileReader = FileInputStream + 编码表(GBK)
    
    
    需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
    
    数据源：
    		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader
    目的地：
    		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter
    		
    		
    字符缓冲流的特殊方法：
    BufferedWriter:
    		public void newLine():根据系统来决定换行符
    BufferedReader:
    		public String readLine()：一次读取一行数据
    		包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
    		
    LineNumberReader
        public void setLineNumber(int lineNumber) 设置当前行号。
        public int getLineNumber() 获得当前行号。 
    
    Properties:属性集合类。是一个可以和IO流相结合使用的集合类。
    Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 
    
    是Hashtable的子类，说明是一个Map集合。
    特殊功能：
    public Object setProperty(String key,String value)：添加元素
    public String getProperty(String key):获取元素
    public Set<String> stringPropertyNames():获取所有的键的集合
    
    这里的集合必须是Properties集合：
    public void load(Reader reader):把文件中的数据读取到集合中
    public void store(Writer writer,String comments):把集合中的数据存储到文件
     