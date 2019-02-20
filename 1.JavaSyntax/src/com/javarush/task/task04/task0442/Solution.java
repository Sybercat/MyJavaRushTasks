package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum=0;
        int n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n =  scanner.nextInt();
            sum=sum+n;
            if (n== -1)
            break;
        }
        System.out.println(sum);


        //напишите тут ваш код
    }
}
