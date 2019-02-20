package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList<String> arr = new ArrayList<>();
        String s;

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String FileName = buf.readLine();
        while (true) {
            s = buf.readLine();
            arr.add(s);
            if (s.equals("exit")) break;

        }
        buf.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(FileName));
        bw.write(FileName);
        for (String l:arr
             ) {
            bw.newLine();

            bw.write(l);

        }
        bw.close();
    }
}
