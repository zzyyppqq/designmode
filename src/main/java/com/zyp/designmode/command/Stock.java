package com.zyp.designmode.command;

public class Stock {
    private String name = "AAA";
    private int quantity = 10;

    public void buy() {
        System.out.println("buy: " + toString());
    }

    public void sell() {
        System.out.println("sell: " + toString());
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
