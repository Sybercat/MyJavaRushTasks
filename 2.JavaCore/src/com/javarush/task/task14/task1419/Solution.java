package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            String s=null;
            s.trim();
        } catch (NullPointerException  e) {
            exceptions.add(e);
        }

        try {
            String s="";
            s.charAt(10);
        } catch (IndexOutOfBoundsException   e) {
            exceptions.add(e);
        }

        try {
            int [] v = new int[5];
            v[5] = 10;
        } catch (IndexOutOfBoundsException   e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        } catch (ClassCastException  e) {
            exceptions.add(e);
        }

        try {
            String s="digital value";
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream f = new FileInputStream("very_bad_file.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Object o[] = new String[5];
            o[2] = new Integer(200);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            List<Integer> list1 = Arrays.asList(10,20,60,30,22,70,89);

            List<Integer> list2 = Arrays.asList(1,2,45,23,89,66,87,33,19,39);

            //list1.forEach(System.out::println);

            list1.addAll(list2);
        } catch (UnsupportedOperationException e) {
            exceptions.add(e);
        }

        try {
            int[] v = new int[-10];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
    }
}