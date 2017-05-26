package com.pjatk.tasks.florist;

public class Lilac extends Flower {

    public Lilac(int number) {
        super(number);
    }

    @Override
    public String getName() {
        return "bez";
    }

    @Override
    public String getColor() {
        return "biały";
    }
}