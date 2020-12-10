### IO流
    可以读写基本数据类型的数据
    数据输入流：DataInputStream
    			DataInputStream(InputStream in)
    数据输出流：DataOutputStream
    			DataOutputStream(OutputStream out) 
    
    
    内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
    字节数组：
    		ByteArrayInputStream
    		ByteArrayOutputStream
    字符数组：
    		CharArrayReader
    		CharArrayWriter
    字符串：
    		StringReader
    		StringWriter
    		
    打印流
    字节流打印流	PrintStream
    字符打印流	PrintWriter
    
    打印流的特点：
    		A:只有写数据的，没有读取数据。只能操作目的地，不能操作数据源。
    		B:可以操作任意类型的数据。
    		C:如果启动了自动刷新，能够自动刷新。
    		D:该流是可以直接操作文本文件的。
    			哪些流对象是可以直接操作文本文件的呢?
    			FileInputStream
    			FileOutputStream
    			FileReader
    			FileWriter
    			PrintStream
    			PrintWriter
    			看API,查流对象的构造方法，如果同时有File类型和String类型的参数，一般来说就是可以直接操作文件的。
    
    			流：
    				基本流：就是能够直接读写文件的
    				高级流：在基本流基础上提供了一些其他的功能
    		1:可以操作任意类型的数据。
             		print()
             		println()
            2:启动自动刷新
             		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);
             		还是应该调用println()的方法才可以
             		这个时候不仅仅自动刷新了，还实现了数据的换行。
             
             		println()
            		其实等价于于：
            		bw.write();
            		bw.newLine();		
            		bw.flush();
            需求：DataStreamDemo.java复制到Copy.java中
            数据源：
            		DataStreamDemo.java -- 读取数据 -- FileReader -- BufferedReader
            目的地：
            		Copy.java -- 写出数据 -- FileWriter -- BufferedWriter -- PrintWriter
            
            标准输入输出流
            System类中的两个成员变量：
            	public static final InputStream in “标准”输入流。
            		public static final PrintStream out “标准”输出流。
            
            		InputStream is = System.in;
            		PrintStream ps = System.out;
            
            
            System.in 标准输入流。是从键盘获取数据的
            
            键盘录入数据：
            		A:main方法的args接收参数。
            			java HelloWorld hello world java
            		B:Scanner(JDK5以后的)
            			Scanner sc = new Scanner(System.in);
            			String s = sc.nextLine();
            			int x = sc.nextInt()
            		C:通过字符缓冲流包装标准输入流实现
            			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            随机访问流：
            		RandomAccessFile类不属于流，是Object类的子类。
            		但它融合了InputStream和OutputStream的功能。
            		支持对文件的随机访问读取和写入。
            
            public RandomAccessFile(String name,String mode)：第一个参数是文件路径，第二个参数是操作文件的模式。
            		模式有四种，我们最常用的一种叫"rw",这种方式表示我既可以写数据，也可以读取数据 
            
            序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象 -- 流数据(ObjectOutputStream)
            反序列化流:把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据 -- 对象(ObjectInputStream)
