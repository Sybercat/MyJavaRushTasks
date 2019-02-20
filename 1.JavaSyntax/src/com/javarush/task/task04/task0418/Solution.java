package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numa = reader.readLine();
        int num1 = Integer.parseInt(numa);
        numa = reader.readLine();
        int num2 = Integer.parseInt(numa);

        if (num1<num2) System.out.println(num1);
        else if (num2<num1) System.out.println(num2);
        else System.out.println(num1);
        //напишите тут ваш код
    }
}