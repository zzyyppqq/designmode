package com.zyp.designmode.proxy;

public class StaticProxy implements Subject {
    private Subject proxyObject;

    public StaticProxy(Subject proxyObject) {
        this.proxyObject = proxyObject;
    }


    @Override
    public void buy() {
        System.out.println("start");
        proxyObject.buy();
        System.out.println("end");
    }
}
