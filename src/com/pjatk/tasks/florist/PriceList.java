package com.pjatk.tasks.florist;

import java.util.HashMap;

public final class PriceList extends HashMap<String, Double> {

    private final static PriceList priceList = new PriceList();

    public static PriceList getInstance() {
        return priceList;
    }

    private PriceList(){
    }
}