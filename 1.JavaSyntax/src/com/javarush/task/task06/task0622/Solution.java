package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr=new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 5; j++) {
            arr[j] = Integer.parseInt(reader.readLine());

        }
        for(int i = 4 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }

    }


        for (int j = 0; j < 5; j++) {
            System.out.println(arr[j]);
        }
        //напишите тут ваш код
    }
}
