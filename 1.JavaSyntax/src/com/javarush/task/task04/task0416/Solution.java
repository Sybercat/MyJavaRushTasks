package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.lang.invoke.SwitchPoint;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Times = reader.readLine();
        float t = Float.parseFloat(Times);
        int realt;
        realt=(int)(t%5);
        if (realt==5) System.out.println("зелёный");
        else if (realt==4) System.out.println("красный");
        else if (realt==3) System.out.println("жёлтый");
        else System.out.println("зеленый");

        //напишите тут ваш код
    }
}