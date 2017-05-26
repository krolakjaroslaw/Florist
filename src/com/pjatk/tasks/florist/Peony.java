package com.pjatk.tasks.florist;

public class Peony extends Flower {

    public Peony(int number) {
        super(number);
    }

    @Override
    public String getName() {
        return "piwonia";
    }

    @Override
    public String getColor() {
        return "czerwony";
    }
}