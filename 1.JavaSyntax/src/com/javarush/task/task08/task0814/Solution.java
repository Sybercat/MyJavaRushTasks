package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> mySet = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 20 ; i++) {
            mySet.add(random.nextInt(50));

        }
        return mySet;

        // напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        HashSet<Integer> bufSet = new HashSet<>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element > 10) {
                iterator.remove();
            }
        }
        return set;
        // напишите тут ваш код

    }

    public static void main(String[] args) {



    }
}
