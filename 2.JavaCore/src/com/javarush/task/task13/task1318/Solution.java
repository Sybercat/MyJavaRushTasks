package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String FileName = buf.readLine();
        buf.close();

        FileInputStream br = new FileInputStream(FileName);
        int i=-1;
        while((i=br.read())!=-1){

            System.out.print((char)i);
        }
        br.close();

        // напишите тут ваш код
    }
}