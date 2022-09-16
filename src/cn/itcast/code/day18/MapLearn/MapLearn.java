package cn.itcast.code.day18.MapLearn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
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
 */
public class MapLearn {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        System.out.println("Map" + m);

        //添加功能
        System.out.println("put: " + m.put("文章","马伊琍"));
        System.out.println("put: " + m.put("文章","姚笛"));
        System.out.println("Map" + m);



        m.put("邓超","孙俪");
        m.put("周杰伦","昆凌");
        m.put("黄晓明","杨颖");
        System.out.println("Map" + m);

        //boolean containsKey(Object key)：判断集合是否包含指定的键
        System.out.println("containsKey:" + m.containsKey("邓超"));
        //boolean containsValue(Object value):判断集合是否包含指定的值
        System.out.println("containsValue:" + m.containsValue("孙俪"));
        //boolean isEmpty()：判断集合是否为空
        System.out.println("isEmpty:" + m.isEmpty());

        //int size()：返回集合中的键值对的对数
        System.out.println("size:" + m.size());

        //V remove(Object key)：根据键删除键值对元素，并把值返回
        System.out.println("remove:" + m.remove("邓超"));
        //void clear():移除所有的键值对元素
        //一般不使用
        //m.clear();
        System.out.println("Map" + m);


        //V get(Object key):根据键获取值

        System.out.println("get:" + m.get("邓超"));
        System.out.println("get:" + m.get("文章"));
        System.out.println("--------");

        //Set<K> keySet():获取集合中所有键的集合
        Set<String> mSet = m.keySet();
        for(String s : mSet){
            System.out.println("key: " + s);

        }

        System.out.println("-----");
        //Collection<V> values():获取集合中所有值的集合
        Collection<String> mCollect = m.values();
        for(String s: mCollect){
            System.out.println("value:" + s);
        }


        System.out.println("Map遍历获取元素");

        //获取所有的键，使用键去找值
        for(String key: mSet){
            String value = m.get(key);
            System.out.println(key + "---" + value);
        }

        System.out.println("Map集合的遍历的方式2");
        //Set<Map.Entry<K,V>> entrySet():???
        //获取键值对对象的集合
        Set<Map.Entry<String,String>> se = m.entrySet();

        //遍历键值对对象的集合，得到每一个键值对对象
        for(Map.Entry<String,String> me: se){
            //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "----" + value);
        }












    }

}
