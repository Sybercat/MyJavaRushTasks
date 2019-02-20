package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int buf;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());;
        for (int i = 1; i < N ; i++) {
            buf = Integer.parseInt(reader.readLine());
            maximum=maximum<buf?buf:maximum;


        }


        //напишите тут ваш код

        System.out.println(maximum);
    }
}
