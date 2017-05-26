package com.pjatk.tasks.florist;

public class Freesia extends Flower {

    public Freesia(int number) {
        super(number);
    }

    @Override
    public String getName() {
        return "frezja";
    }

    @Override
    public String getColor() {
        return "żółty";
    }
}