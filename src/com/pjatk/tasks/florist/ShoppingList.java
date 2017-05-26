package com.pjatk.tasks.florist;

import java.util.ArrayList;

public abstract class ShoppingList {

    private ArrayList<Flower> shoppingList;
    Customer customer;

    public ShoppingList(Customer customer) {
        this.customer = customer;
        shoppingList = new ArrayList<>();
    }

    public ArrayList<Flower> getShoppingList() {
        return shoppingList;
    }

    abstract String title();

    @Override
    public String toString() {
        String result = title();
        if (shoppingList.isEmpty()) {
            result += " -- pusto";
        }
        for (int i=0; i<shoppingList.size(); i++) {
            result += "\n" + shoppingList.get(i);
        }
        return result;
    }
}