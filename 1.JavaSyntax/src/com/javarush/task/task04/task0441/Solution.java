package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int buf;
        int[] n = new int[3];
        Scanner scanner = new Scanner(System.in);
            n[0] = scanner.nextInt();
            n[1] = scanner.nextInt();
            n[2] = scanner.nextInt();
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 2 ; j++) {
                if (n[j]>n[j+1]) {
                    buf=n[j];
                    n[j]=n[j+1];
                    n[j+1]=buf;
                }
            }

        }
        System.out.println(n[1]);
        //напишите тут ваш код
    }
}
