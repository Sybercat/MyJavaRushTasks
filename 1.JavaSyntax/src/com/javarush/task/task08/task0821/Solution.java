package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> nmap = new HashMap<>();

        nmap.put("Иванов", "Вася");
        nmap.put("Петров", "Гена");
        nmap.put("Сидоров", "Лёша");
        nmap.put("Антонов", "Вадим");
        nmap.put("Вадомов", "Антон");
        nmap.put("Хохлов", "Дима");
        nmap.put("Греков", "Ваня");
        nmap.put("Симонов", "Никита");
        nmap.put("Антонов", "Денис");
        nmap.put("Николаев", "Лёша");

        //напишите тут ваш код

        return nmap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
