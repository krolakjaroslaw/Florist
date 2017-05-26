package com.pjatk.tasks.florist;

public class ShoppingCart extends ShoppingList {

    public ShoppingCart(Customer customer) {
        super(customer);
    }

    @Override
    String title() {
        return "Wózek właściciel " + customer.getName();
    }
}