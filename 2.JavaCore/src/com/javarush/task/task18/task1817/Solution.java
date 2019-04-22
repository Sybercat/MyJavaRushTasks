package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        int q=0;
        int w;

        Pattern pattern = Pattern.compile(" ");


        if (args[0]!=null){
            FileInputStream f1 = new FileInputStream(args[0]);
            w=f1.available();
            while (f1.available() > 0) {
                Matcher matcher = pattern.matcher(String.valueOf((char) f1.read()));
                if (matcher.find()) q++;
            }
            f1.close();
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println(f.format(((float)q/w*100)));


        }
    }


}
