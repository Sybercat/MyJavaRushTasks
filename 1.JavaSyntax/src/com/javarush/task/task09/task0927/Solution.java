package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cmap = new HashMap<>();
        cmap.put("Eba", new Cat("Eba"));
        cmap.put("Bla", new Cat("Bla"));
        cmap.put("Ola", new Cat("Ola"));
        cmap.put("Kisa", new Cat("Kisa"));
        cmap.put("Mor", new Cat("Mor"));
        cmap.put("Rom", new Cat("Rom"));
        cmap.put("Cozy", new Cat("Cozy"));
        cmap.put("Concesness", new Cat("Concesness"));
        cmap.put("Abdul", new Cat("Abdul"));
        cmap.put("Halil", new Cat("Halil"));

        return cmap;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cset = new HashSet<>();
        cset.addAll(map.values());
        return cset;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
