package com.example.leecode;

import java.util.*;

/**
 * @Auther: HuangRui
 * @Date: 2021/7/6 13:40
 * @Description:
 */
public class Topic_1418 {

    public static void main(String[] args) {
        Topic_1418 topic_1418 = new Topic_1418();
        List<String> list1 = new ArrayList<>();
        list1.add("Laura");
        list1.add("2");
        list1.add("Bean Burrito");
        List<String> list2 = new ArrayList<>();
        list2.add("Jhon");
        list2.add("2");
        list2.add("Beef Burrito");
        List<String> list3 = new ArrayList<>();
        list3.add("Melissa");
        list3.add("2");
        list3.add("Soda");
        List<List<String>> param = new ArrayList<>();
        param.add(list1);
        param.add(list2);
        param.add(list3);
        topic_1418.displayTable(param);
    }

    public List<List<String>> displayTable(List<List<String>> orders) {
        TreeMap<String, Map<String,Integer>> tableMap=new TreeMap<String, Map<String,Integer>>(new Comparator<String>(){
            public int compare(String a,String b){
                return Integer.valueOf(a)-Integer.valueOf(b);
            }
        });
        Set<String> foodSet = new HashSet<>();
        for (List<String> order : orders){
            String table = order.get(1);
            String food = order.get(2);
            Map<String,Integer> foodMap = new TreeMap<String,Integer>();
            if(tableMap.containsKey(table)){
                foodMap = tableMap.get(table);
                Integer foodCount = foodMap.get(food)==null?0:foodMap.get(food);
                foodMap.put(food,++foodCount);
            }else{

                foodMap.put(food,1);
                tableMap.put(table,foodMap);
            }
            foodSet.add(food);
        }

        List<String> foodList = new ArrayList<>();
        foodList.addAll(foodSet);
        Collections.sort(foodList);


        LinkedList<List<String>> result = new LinkedList<>();
        for(String table:tableMap.keySet()){
            Map<String, Integer> foodMap = tableMap.get(table);
            LinkedList<String> temp = new LinkedList<>();
            temp.addFirst(table);
            for(String food:foodList){
                Integer foodCount = foodMap.get(food)==null?0:foodMap.get(food);
                temp.add(foodCount.toString());
            }
            result.add(temp);
        }
        List<String> titles = new ArrayList<String>();
        titles.add("Table");
        for(String food:foodList){
            titles.add(food);
        }
        result.addFirst(titles);
        return result;
    }
}
