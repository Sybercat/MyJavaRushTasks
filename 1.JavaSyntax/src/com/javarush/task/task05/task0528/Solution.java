package com.javarush.task.task05.task0528;
import java.util.Date;
import java.text.SimpleDateFormat;
/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM YYYY");
        System.out.println(formatForDateNow.format(date));

        //напишите тут ваш код
    }
}
