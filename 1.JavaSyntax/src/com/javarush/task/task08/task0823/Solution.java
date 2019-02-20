package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringTokenizer st = new StringTokenizer(s," ");

        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            key = key.replace(key.substring(0,1), key.substring(0,1).toUpperCase());
            System.out.println(key);
            //s = s.replace(key, key.substring(0,1).toUpperCase());
        }

        System.out.println(s);

        //напишите тут ваш код
    }
}
