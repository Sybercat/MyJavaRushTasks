package com.javarush.task.task14.task1417;

public class Hrivna extends Money {

    Hrivna (double d) {
        super (d);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}