package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;


public class Solution {
    public static void main(String[] args) throws Exception {

        HashSet<String> hs = new HashSet<>();
        String s[]={"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "женьшень", "земляника", "ирис", "картофель"};
        for (String k: s
             ) {
            hs.add(k);

        }
        for (String k: hs
             ) {
            System.out.println(k);

        }

        //напишите тут ваш код

    }
}
