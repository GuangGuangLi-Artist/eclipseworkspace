package cn.itcast.code.day18.MapPractise;
/*
    为了更符合要求：
		这次的数据就看成是学生对象。

传智播客
		bj	北京校区
			jc	基础班
					林青霞		27
					风清扬		30
			jy	就业班
					赵雅芝		28
					武鑫		29
		sh	上海校区
			jc	基础班
					郭美美		20
					犀利哥		22
			jy	就业班
					罗玉凤		21
					马征		23
		gz	广州校区
			jc	基础班
					王力宏		30
					李静磊		32
			jy	就业班
					郎朗		31
					柳岩		33
		xa	西安校区
			jc	基础班
					范冰冰		27
					刘意		30
			jy	就业班
					李冰冰		28
					张志豪		29
 */

import cn.itcast.code.day15.CollectLearn.StudentsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapNested {

    public static void main(String[] args) {
        //创建大集合
        HashMap<String, HashMap<String,ArrayList<StudentsDemo>>> czbkMap = new HashMap<>();

        //北京校区
        HashMap<String,ArrayList<StudentsDemo>> bjMap = new HashMap<>();


        //基础班学生
        ArrayList<StudentsDemo> bjjcArray = new ArrayList<>();
        StudentsDemo s1 = new StudentsDemo("林青霞",27,"女");
        StudentsDemo s2 = new StudentsDemo("风清扬",30,"男");
        bjjcArray.add(s1);
        bjjcArray.add(s2);

        bjMap.put("基础班",bjjcArray);

        //就业班学生
        ArrayList<StudentsDemo> bjjyArray = new ArrayList<>();
        StudentsDemo s3 = new StudentsDemo("赵雅芝",28,"女");
        StudentsDemo s4 = new StudentsDemo("武鑫",29,"男");
        bjjyArray.add(s3);
        bjjyArray.add(s4);

        bjMap.put("就业班",bjjcArray);



        //西安校区
        HashMap<String,ArrayList<StudentsDemo>> xaMap = new HashMap<>();


        //基础班学生
        ArrayList<StudentsDemo> xajcArray = new ArrayList<>();
        StudentsDemo s5 = new StudentsDemo("范冰冰",27,"女");
        StudentsDemo s6 = new StudentsDemo("刘意",30,"男");
        xajcArray.add(s5);
        xajcArray.add(s6);

        xaMap.put("基础班",xajcArray);

        //就业班学生
        ArrayList<StudentsDemo> xajyArray = new ArrayList<>();
        StudentsDemo s7 = new StudentsDemo("李冰冰",28,"女");
        StudentsDemo s8 = new StudentsDemo("张志豪",29,"男");
        xajyArray.add(s7);
        xajyArray.add(s8);

        xaMap.put("就业班",xajyArray);

        //添加到大集合
        czbkMap.put("北京校区",bjMap);
        czbkMap.put("西安校区",xaMap);


        //遍历集合


        Set<String> czbkKeySet = czbkMap.keySet();
        for(String czbkKey:czbkKeySet){
            HashMap<String,ArrayList<StudentsDemo>> innerMap = czbkMap.get(czbkKey);
            System.out.println(czbkKey);

            Set<String> banJiKeySet = innerMap.keySet();
            for(String banJiKey:banJiKeySet){
                System.out.println("\t" + banJiKey);
                ArrayList<StudentsDemo> stuList= innerMap.get(banJiKey);

                //遍历学生集合
                for(StudentsDemo stu: stuList){
                    System.out.println("\t\t" + stu.getName() + "----" + stu.getAge());
                }
            }
        }



    }


}
