package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date();
        // эта самая строчка
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd");
        String s = reader.readLine();
        date = simpledateformat.parse(s);
        SimpleDateFormat sd1 = new SimpleDateFormat("MMM d, yyyy");
        System.out.println(sd1.format(date).toUpperCase());
        //напишите тут ваш код
    }
}
