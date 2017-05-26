package com.pjatk.tasks.florist;

public abstract class Flower {

    private int number;

    public Flower (int number) {
        this.number = number;
    }

    public abstract String getName();
    public abstract String getColor();

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        PriceList priceList = PriceList.getInstance();
        String key = this.getName();
        return priceList.containsKey(key) ? priceList.get(key) : -1.0;
    }

    @Override
    public String toString() {
        return getName() + ", kolor: " + getColor() + " ilość " + getNumber()
                + ", cena " + getPrice();
    }
}