package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arr = new ArrayList<>();
        int[] k= {1,2,3,4,5};
        int[] l = {1,2};
        int[] m = {1,2,3,4};
        int[] n = {1,2,3,4,5,6,7};
        int[] o = new int[0];
        arr.add(k);
        arr.add(l);
        arr.add(m);
        arr.add(n);
        arr.add(o);

        return arr;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
