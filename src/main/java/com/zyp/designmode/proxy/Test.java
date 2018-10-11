package com.zyp.designmode.proxy;

public class Test {
    public static void main(String[] args) {

        new StaticProxy(new Buyer1()).buy();

        final DynamicProxy dynamicProxy = new DynamicProxy();
        Subject buyer1 = (Subject) dynamicProxy.newProxyInstance(new Buyer1());
        buyer1.buy();

        Subject buyer2 = (Subject) dynamicProxy.newProxyInstance(new Buyer2());
        buyer2.buy();


        CglibProxy cglibProxy = new CglibProxy();
        Buyer buyer = (Buyer) cglibProxy.newProxyInstance(new Buyer());
        buyer.buy();
    }
}
