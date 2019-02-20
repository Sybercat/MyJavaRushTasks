package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        String buf;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int j = 0; j < 5; j++) {
            strings.add(reader.readLine());

        }

        for (int i = 0; i <13 ; i++) {
            buf=strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0,buf);

        }
        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));

        }
        //напишите тут ваш код
    }
}
