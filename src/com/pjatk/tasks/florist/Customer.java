package com.pjatk.tasks.florist;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

    private String name;
    private double cash;
    private ShoppingCart shoppingCart;
    private ArrayList<Flower> order;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        shoppingCart = new ShoppingCart(this);
        order = shoppingCart.getShoppingList();
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public void get(Flower flower) {
        order.add(flower);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void pay() {
        for (Iterator<Flower> it = order.iterator(); it.hasNext();) {
            if (it.next().getPrice() == -1.0)
                it.remove();
        }
        orderValue();
        while (cash < orderValue()) {
            order.remove(order.size()-1);
            orderValue();
        }
        cash -= orderValue();
    }

    public void pack(Box box) {
        for (Flower flower : order)
            box.getShoppingList().add(flower);
        order.clear();
    }

    private double orderValue() {
        double price = 0.0;
        for (Flower flower : order)
            price += flower.getNumber()*flower.getPrice();
        return price;
    }
}