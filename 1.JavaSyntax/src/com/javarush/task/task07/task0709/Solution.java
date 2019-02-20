package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        int minl;
        int minli;
        ArrayList<String> maxstrings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 5; j++) {
            strings.add(reader.readLine());

        }
        minl=strings.get(0).length();
        minli=0;
        for (int i = 1; i <5 ; i++) {

            if (minl > strings.get(i).length()) {
                minl = strings.get(i).length();
                minli = i;
            }
        }


        for (int j = 0; j <5 ; j++) {

            if (minl==strings.get(j).length()) maxstrings.add(strings.get(j));

        }


        if (maxstrings.size()==0) System.out.println(strings.get(minli));

        else for (int j = 0; j < maxstrings.size() ; j++) {
            System.out.println(maxstrings.get(j));

        }

    }

    //напишите тут ваш код
    }

