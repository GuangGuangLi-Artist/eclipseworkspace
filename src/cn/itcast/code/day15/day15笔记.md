### 集合
     集合的由来：
     		我们学习的是面向对象语言，而面向对象语言对事物的描述是通过对象体现的，为了方便对多个对象进行操作，我们就必须把这多个对象进行存储。
     		而要想存储多个对象，就不能是一个基本的变量，而应该是一个容器类型的变量，在我们目前所学过的知识里面，有哪些是容器类型的呢?
     		数组和StringBuffer。但是呢?StringBuffer的结果是一个字符串，不一定满足我们的要求，所以我们只能选择数组，这就是对象数组。
     		而对象数组又不能适应变化的需求，因为数组的长度是固定的，这个时候，为了适应变化的需求，Java就提供了集合类供我们使用。
     
     数组和集合的区别?
     		A:长度区别
     			数组的长度固定
     			集合长度可变
     		B:内容不同
     			数组存储的是同一种类型的元素
     			而集合可以存储不同类型的元素
     		C:元素的数据类型问题	
     			数组可以存储基本数据类型，也可以存储引用数据类型
     			集合只能存储引用类型
     
     刚说过集合是存储多个元的，但是呢，存储多个元素我们也是有不同需求的：比如说，我要这多个元素中不能有相同的元素，
     再比如说，我要这多个元素按照某种规则排序一下。针对不同的需求，Java就提供了不同的集合类，这样呢，Java就提供了很多个集合类。
     这多个集合类的数据结构不同,结构不同不重要的，重要的是你要能够存储东西，并且还要能够使用这些东西，比如说判断，获取等。
     既然这样，那么，这多个集合类是有共性的内容的，我们把这些集合类的共性内容不断的向上提取，最终就能形成集合的继承体系结构。
     
     数据结构：数据的存储方式。
     
     Collection:是集合的顶层接口，它的子体系有重复的，有唯一的，有有序的，有无序的。(后面会慢慢的讲解)
     
     Collection的功能概述：
     1：添加功能
     		boolean add(Object obj):添加一个元素
     		boolean addAll(Collection c):添加一个集合的元素
     2:删除功能
     		void clear():移除所有元素
     		boolean remove(Object o):移除一个元素
     		boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
     3:判断功能
     		boolean contains(Object o)：判断集合中是否包含指定的元素
     		boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
     		boolean isEmpty()：判断集合是否为空
     4:获取功能
     		Iterator<E> iterator()(重点)
     5:长度功能
     		int size():元素的个数
     		面试题：数组有没有length()方法呢?字符串有没有length()方法呢?集合有没有length()方法呢?
     6:交集功能
     		boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
     7：把集合转换为数组
     		Object[] toArray()
     		
     iterator:
         Iterator<E> iterator():迭代器，集合的专用遍历方法
             E next()返回迭代的下一个元素。 并移动到下一个位置
             boolean hasNext() 如果仍有元素可以迭代，则返回 true。
     迭代器源码
     当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法
     
     public interface Inteator {
     	boolean hasNext();
     	Object next(); 
     }
     
     public interface Iterable {
         Iterator iterator();
     }
     
     public interface Collection extends Iterable {
     	Iterator iterator();
     }
     
     public interface List extends Collection {
     	Iterator iterator();
     }
     
     public class ArrayList implements List {
     	public Iterator iterator() {
             return new Itr();
         }
         
         private class Itr implements Iterator {
         	public boolean hasNext() {}
     		public Object next(){} 
         }
     }
     
     
     Collection c = new ArrayList();
     c.add("hello");
     c.add("world");
     c.add("java");
     Iterator it = c.iterator();	 //new Itr();   
     while(it.hasNext()) {
     	String s = (String)it.next();
     	System.out.println(s);
     }
     
      List接口概述
             有序的 collection（也称为序列）。此接口的用户可以对列表中每个元素的插入位置进行精确地控制。用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。
     
             与 set 不同，列表通常允许重复的元素。
     
             List接口成员方法
                 void add(int index,E element) 在指定位置添加元素
                 E remove(int index) 移除指定位置的元素
                 E get(int index)  获取指定位置的元素
                 E set(int index,E element) 根据索引修改指定元素，并返回修改的元素
                 ListIterator listIterator() List特有的迭代器
                     boolean hasPrevious() 如果以逆向遍历列表，列表迭代器有多个元素，则返回 true
                     E previous() 列表中的上一个元素。
                     逆向遍历的前提是正向遍历，所以实用性并不高，在开发中使用的并不多
     
     
            List特有遍历功能
                 size()和get()方法结合
      		
            我有一个集合，如下，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
            ConcurrentModificationException:当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。
             产生的原因：
                      迭代器是依赖于集合而存在的，在判断成功后，集合的中新添加了元素，而迭代器却不知道，所以就报错了，这个错叫并发修改异常。
                      其实这个问题描述的是：迭代器遍历元素的时候，通过集合是不能修改元素的。
             如何解决呢?
                      A:迭代器迭代元素，迭代器修改元素
                          元素是跟在刚才迭代的元素后面的。
                      B:集合遍历元素，集合修改元素(普通for)
                          元素在最后添加的。

        