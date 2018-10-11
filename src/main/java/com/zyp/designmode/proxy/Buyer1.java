package com.zyp.designmode.proxy;

/**
 * Created by zhangyiipeng on 2018/10/10.
 */

public class Buyer1 implements Subject {
    @Override
    public void buy() {
        System.out.println("小成要买Mac");
    }
}
