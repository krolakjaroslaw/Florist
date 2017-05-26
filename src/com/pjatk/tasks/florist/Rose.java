package com.pjatk.tasks.florist;

public class Rose extends Flower {

    public Rose(int number) {
        super(number);
    }

    @Override
    public String getName() {
        return "róża";
    }

    @Override
    public String getColor() {
        return "czerwony";
    }
}