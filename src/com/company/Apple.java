package com.company;

public class Apple extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "eat Apple";
    }
}
