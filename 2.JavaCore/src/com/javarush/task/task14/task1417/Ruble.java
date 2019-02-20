package com.javarush.task.task14.task1417;

public class Ruble extends Money {

    Ruble (double d) {
        super (d);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}