package com.javarush.task.task18.task1802;

import java.io.*;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min=255;
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));


            while (file.ready()) {
                int buffer=file.read();
                if (min>= buffer) min=buffer;
            }
            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found");
        } catch (IOException e) {
            System.out.println("Can't Read File " + fileName);
        }

        System.out.println(min);


    }
}
