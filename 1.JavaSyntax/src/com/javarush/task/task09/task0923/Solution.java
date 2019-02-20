package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static char[] towels = new char[]{'б', 'в', 'г', 'д'};

    public static void main(String[] args) throws Exception {
        String first = "";
        String Second = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine().replace(" ","");
        for (int i = 0; i < inp.length(); i++) {
            if (isVowel(inp.charAt(i))) first = first + inp.charAt(i)+" ";
                else  Second = Second + inp.charAt(i) + " ";

        }
        System.out.println(first);
        System.out.println(Second);
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}