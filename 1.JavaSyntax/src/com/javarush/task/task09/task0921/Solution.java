package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                arr.add(Integer.parseInt(s.readLine()));
            } catch (Exception t) {
                for (Integer a : arr
                ) {

                    System.out.println(a);
                }
                break;
            }
        }
        //напишите тут ваш код
    }
}
