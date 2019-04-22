package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        int q=0;

        Pattern pattern = Pattern.compile("[a-zA-Z]");

        if (args[0]!=null){
            FileInputStream f1 = new FileInputStream(args[0]);
            while (f1.available() > 0) {
                Matcher matcher = pattern.matcher(String.valueOf((char) f1.read()));
                if (matcher.find()) q++;
            }
            f1.close();
            System.out.println(q);

        }
    }
}
