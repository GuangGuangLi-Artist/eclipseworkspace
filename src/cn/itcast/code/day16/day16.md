### Collections
    
    Vector的特有功能：
    1：添加功能
            public void addElement(Object obj)		--	add()
    2：获取功能
            public Object elementAt(int index)		--  get()
            public Enumeration elements()			--	Iterator iterator()
                    boolean hasMoreElements()				hasNext()
                    Object nextElement()					next()
    LinkedList的特有功能：
    		A:添加功能
    			public void addFirst(Object e)
    			public void addLast(Object e)
    		B:获取功能
    			public Object getFirst()
    			public Obejct getLast()
    		C:删除功能
    			public Object removeFirst()
    			public Object removeLast()
    
    ArrayList存储字符串并遍历

     我们按照正常的写法来写这个程序， 结果确出错了。
     为什么呢?
            因为我们开始存储的时候，存储了String和Integer两种类型的数据。
            而在遍历的时候，我们把它们都当作String类型处理的，做了转换，所以就报错了。
     但是呢，它在编译期间却没有告诉我们。
     所以，我就觉得这个设计的不好。
     回想一下，我们的数组
            String[] strArray = new String[3];
            strArray[0] = "hello";
            strArray[1] = "world";
            strArray[2] = 10;
     集合也模仿着数组的这种做法，在创建对象的时候明确元素的数据类型。这样就不会在有问题了。
     而这种技术被称为：泛型。

     泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。参数化类型，把类型当作参数一样的传递。
     格式：
            <数据类型>
            此处的数据类型只能是引用类型。
     好处：
            A:把运行时期的问题提前到了编译期间
            B:避免了强制类型转换
            C:优化了程序设计，解决了黄色警告线
     泛型在哪些地方使用呢?
     		看API，如果类，接口，抽象类后面跟的有<E>就说要使用泛型。一般来说就是在集合中使用。
     		
     泛型由来
             为什么会有泛型呢?
                 通过案例引入
                 早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。也就存在这隐患，所以Java提供了泛型来解决这个安全问题。
        泛型类
     	把泛型定义在类上
     		格式:public class 类名<泛型类型1,…>
     		注意:泛型类型必须是引用类型
        泛型方法
        把泛型定义在方法上
        	格式:public <泛型类型> 返回类型 方法名(泛型类型 .)	
        	
        泛型接口
         把泛型定义在接口上
             格式:public  interface 接口名<泛型类型1…>
     泛型通配符<?>
     	任意类型，如果没有明确，那么就是Object以及任意的Java类了
     	? extends E
     		向下限定，E及其子类
     	? super E
     		向上限定，E及其父类
     	