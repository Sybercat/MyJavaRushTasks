package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int input;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        input = Integer.parseInt(reader.readLine());
        if (input<=150) break;
        }
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {

        BigInteger f=BigInteger.ONE;
        if (n<0) f=BigInteger.ZERO;
        else {

            for (int i = 1; i <= n; i++) {
                f = f.multiply(BigInteger.valueOf(i));

            }
        }
        //add your code here

        return f.toString();
    }
}
