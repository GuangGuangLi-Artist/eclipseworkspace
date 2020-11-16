### Map
    作为学生来说，是根据学号来区分不同的学生的，那么假设我现在已经知道了学生的学号，我要根据学号去获取学生姓名，请问怎么做呢?
    如果采用前面讲解过的集合，我们只能把学号和学生姓名作为一个对象的成员，然后存储整个对象，将来遍历的时候，判断，获取对应的名称。
    但是呢，如果我都能把学生姓名拿出来了，我还需要根据编号去找吗?
    针对我们目前的这种需求：仅仅知道学号，就想知道学生姓名的情况，Java就提供了一种新的集合 Map。
    通过查看API，我们知道Map集合的一个最大的特点，就是它可以存储键值对的元素。这个时候存储我们上面的需求，就可以这样做
    		学号1		姓名1
    		学号2 	姓名2
    		学号3		姓名3
    		学号2(不行)姓名4
    		学号4               姓名4
    Map集合的特点：
    		将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。 
    
    Map集合和Collection集合的区别?
    		Map集合存储元素是成对出现的，Map集合的键是唯一的，值是可重复的。可以把这个理解为：夫妻对
    		Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可重复的。可以把这个理解为：光棍(11.11)
    
    注意：
    		Map集合的数据结构值针对键有效，跟值无关	
    			HashMap，TreeMap等会讲。
    	Collection集合的数据结构是针对元素有效
    
    Map集合的功能概述：
    1:添加功能
    		V put(K key,V value):添加元素。这个其实还有另一个功能?先不告诉你，等会讲
    			如果键是第一次存储，就直接存储元素，返回null
    			如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
    2:删除功能
    		void clear():移除所有的键值对元素
    		V remove(Object key)：根据键删除键值对元素，并把值返回
    3:判断功能
    		boolean containsKey(Object key)：判断集合是否包含指定的键
    		boolean containsValue(Object value):判断集合是否包含指定的值
    		boolean isEmpty()：判断集合是否为空
    4:获取功能
    		Set<Map.Entry<K,V>> entrySet():???
    		V get(Object key):根据键获取值
    		Set<K> keySet():获取集合中所有键的集合
    		Collection<V> values():获取集合中所有值的集合
    5：长度功能
    		int size()：返回集合中的键值对的对数 
    Map集合的遍历。
     Map -- 夫妻对
     思路：
     		A:把所有的丈夫给集中起来。
     		B:遍历丈夫的集合，获取得到每一个丈夫。
     		C:让丈夫去找自己的妻子。
     
     转换：
     		A:获取所有的键
     		B:遍历键的集合，获取得到每一个键
     		C:根据键去找值
      Map集合的遍历。
     Map -- 夫妻对
      
     思路：
      		A:获取所有结婚证的集合
      		B:遍历结婚证的集合，得到每一个结婚证
      		C:根据结婚证获取丈夫和妻子
      
     转换：
      		A:获取所有键值对对象的集合
      		B:遍历键值对对象的集合，得到每一个键值对对象
      		C:根据键值对对象获取键和值
      
     这里面最麻烦的就是键值对对象如何表示呢?
     看看我们开始的一个方法：
        Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
     
     LinkedHashMap类概述
        Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序
            由哈希表保证键的唯一性
            由链表保证键的有序（存储和取出的顺序一致）
            
     1:Hashtable和HashMap的区别?
      Hashtable:线程安全，效率低。不允许null键和null值
      HashMap:线程不安全，效率高。允许null键和null值
      
      2:List,Set,Map等接口是否都继承子Map接口?
      List，Set不是继承自Map接口，它们继承自Collection接口
      Map接口本身就是一个顶层接口
      
      Collections:是针对集合进行操作的工具类，都是静态方法。
      	
    面试题：
    Collection和Collections的区别?
    Collection:是单列集合的顶层接口，有子接口List和Set。
    Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
    
    要知道的方法
    public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
    public static <T> int binarySearch(List<?> list,T key):二分查找
    public static <T> T max(Collection<?> coll):最大值
    public static void reverse(List<?> list):反转
    public static void shuffle(List<?> list):随机置换
      	
    如果同时有自然排序和比较器排序，那么以比较器排序为准
    
    集合：
        Colllection(单列集合)
            List(有序，可重复)
                ArrayList
                    底层数据结构是数组，查询快，增删慢
                    线程不安全,效率高
                Vector
                    底层数据结构是数组，查询快，增删慢
                    线程安全,效率低
                LinkedList
                    底层数据结构是链表，查询慢，增删快
                    线程不安全,效率高
            Set(无序，唯一)
                HashSet
                    底层数据结构是哈希表
                    哈希表依赖两个方法 hashCode()和eaquals()
                    执行顺序：
                        首先判断hashCode()值是否相同
                            是:继续执行equals()方法，看其返回值
                               是true:说明元素重复，不添加
                               是法拉瑟：直接添加到集合
                            否:直接添加到集合
                LinkedHashSet
                    底层数据结构由链表和哈希表组成
                    由链表保证元素有序
                    由哈希表保证元素唯一
            TreeSet
                底层数据结构是红黑树（是一种自平衡的二叉树）
                如何保证元素的唯一性呢
                    根据比较的返回值是否是0来决定
                如何保证元素的排序呢？
                    自然排序（元素具备比较性）
                        让元素所属的类实现Comparable接口
                    比较器排序（集合具备比较性）
                        让集合接收一个Comparator的实现类对象
        Map(双列集合)
            Map集合的数据结构仅仅针对值有效，与值无关
            存储的键值对形式的元素，键唯一，值可重复
            
            HashMap
                底层数据结构是哈希表  线程不安全，效率高
                    哈希表依赖两个方法 hashCode()和eaquals()
                    执行顺序：
                        首先判断hashCode()值是否相同
                            是:继续执行equals()方法，看其返回值
                               是true:说明元素重复，不添加
                               是法拉瑟：直接添加到集合
                            否:直接添加到集合
                    LinkeedHashMap
                        底层数据结构由链表和哈希表组成
                            由链表保证元素有序
                            由哈希表保证元素唯一
                    
            Hashtable
                底层数据结构是哈希表 线程安全，效率低
                    哈希表依赖两个方法 hashCode()和eaquals()
                    执行顺序：
                        首先判断hashCode()值是否相同
                            是:继续执行equals()方法，看其返回值
                               是true:说明元素重复，不添加
                               是法拉瑟：直接添加到集合
                            否:直接添加到集合
            TreeMap
                底层数据结构是红黑树（是一种自平衡的二叉树）
                    如何保证元素的唯一性呢
                        根据比较的返回值是否是0来决定
                    如何保证元素的排序呢？
                        自然排序（元素具备比较性）
                            让元素所属的类实现Comparable接口
                        比较器排序（集合具备比较性）
                            让集合接收一个Comparator的实现类对象
                
                                  
      
     
     		
     