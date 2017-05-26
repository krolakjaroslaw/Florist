package com.pjatk.tasks.florist;

public class Box extends ShoppingList {

    public Box(Customer customer) {
        super(customer);
    }

    @Override
    String title() {
        return "Pudełko właściciel " + customer.getName();
    }
}