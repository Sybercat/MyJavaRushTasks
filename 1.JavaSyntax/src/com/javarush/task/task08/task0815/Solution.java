package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (String tmp : map.values())
        {
            if(name.equals(tmp))
            {
                count++;
            }
        }
        return count;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String tmp : map.keySet())
        {
            if(lastName.equals(tmp))
            {
                count++;
            }
        }
        return count;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

     /*  HashMap<String, String> myMap;
       myMap = createMap();
        System.out.println(getCountTheSameFirstName(myMap,"Joe"));
        System.out.println(getCountTheSameLastName(myMap, "Shato"));
*/



    }
}
