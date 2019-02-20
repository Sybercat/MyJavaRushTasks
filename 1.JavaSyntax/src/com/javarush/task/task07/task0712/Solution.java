package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        int minl;
        int maxl;
        int minli;
        int maxli;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 10; j++) {
            strings.add(reader.readLine());

        }
        minl=strings.get(0).length();
        minli=0;
        maxl=strings.get(0).length();
        maxli=0;


        for (int i = 1; i <10 ; i++) {

            if (minl > strings.get(i).length()) {
                minl = strings.get(i).length();
                minli = i;
            } else if (maxl < strings.get(i).length()) {
                maxl = strings.get(i).length();
                maxli = i;
            }
        }
    if (maxli<minli) System.out.println(strings.get(maxli));
    else System.out.println(strings.get(minli));

    //напишите тут ваш код
    }
}
