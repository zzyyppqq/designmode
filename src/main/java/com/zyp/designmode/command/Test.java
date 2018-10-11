package com.zyp.designmode.command;

public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        //获取订单
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        //发送订单
        broker.placeOrders();
    }
}
