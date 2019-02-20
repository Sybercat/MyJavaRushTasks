package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grfatherName = reader.readLine();
        Cat grfather = new Cat(grfatherName);

        String grmotherName = reader.readLine();
        Cat grmother = new Cat(grmotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grfather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, grmother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String dotName = reader.readLine();
        Cat dot = new Cat(dotName, mother, father);

        System.out.println(grfather);
        System.out.println(grmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(dot);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if(parent1 == null)
                return "The cat's name is " + name + ", no mother, father is " + parent2.name;
            else if(parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent1.name + ", no father ";
            else
                return "The cat's name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;

        }
    }

}
