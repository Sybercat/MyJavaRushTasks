package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/



public class Solution {

    public static void main(String[] args){
        try
        {
        divideByZero();
        }
        catch (ArithmeticException t)
        {

            t.printStackTrace();
        }
    }

    public static void divideByZero() throws ArithmeticException

    {
        int k = 5/0;
        System.out.println(k);
    }

}