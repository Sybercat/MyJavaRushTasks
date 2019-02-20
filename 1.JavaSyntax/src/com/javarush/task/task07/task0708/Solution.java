package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        int maxl;
        int maxli;
        ArrayList<String> maxstrings = new ArrayList<>();
        Solution.strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 5; j++) {
            strings.add(reader.readLine());

        }
        maxl=strings.get(0).length();
        maxli=0;
        for (int i = 1; i <5 ; i++) {

            if (maxl < strings.get(i).length()) {
                maxl = strings.get(i).length();
                maxli = i;
            }
        }


            for (int j = 0; j <5 ; j++) {

                if (maxl==strings.get(j).length()) maxstrings.add(strings.get(j));

            }


            if (maxstrings.size()==0) System.out.println(strings.get(maxli));

            else for (int j = 0; j < maxstrings.size() ; j++) {
                System.out.println(maxstrings.get(j));

            }

        }




        //напишите тут ваш код
    }
