package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap <String, String> myMap = new HashMap<>();
        myMap.put("Aleks", "Joe");
        myMap.put("Alek", "Joe");
        myMap.put("Alekins", "Joh");
        myMap.put("Jeck", "London");
        myMap.put("Agata", "Cristie");
        myMap.put("Sape", "Grey");
        myMap.put("Max", "Mad");
        myMap.put("Sato", "Villy");
        myMap.put("Shato", "Bendukodze");
        myMap.put("Avraam", "Linkoln");
        return myMap;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        String s;


        Collection<String> list = copy.values();

        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
        {
            s=itr.next();
            if(Collections.frequency(list, s)>1)
            {

                removeItemFromMapByValue(map, s);

            }
        }





        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {



    }
}
