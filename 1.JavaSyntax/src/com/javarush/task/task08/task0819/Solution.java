package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {



    public static void main(String[] args) {
        Cat x =  new Cat();

        Set<Cat> cats = createCats();
        for (Cat c: cats
        ) {
            x= c;

        }

        cats.remove(x);

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();
        for (int i = 0; i <3 ; i++) {
            cat.add(new Cat());
        }


        //напишите тут ваш код. step 2 - пункт 2
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c: cats
             ) {
            System.out.println(c);

        }
        // step 4 - пункт 4
    }
    public static class Cat{

    }

    // step 1 - пункт 1
}
