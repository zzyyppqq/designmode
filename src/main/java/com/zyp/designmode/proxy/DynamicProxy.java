package com.zyp.designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhangyiipeng on 2018/10/10.
 */

public class DynamicProxy implements InvocationHandler {

    private Object proxyObject;

    public Object newProxyInstance(Object proxyObject){
        this.proxyObject = proxyObject;
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(),proxyObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy);
//        System.out.println(proxy);
        System.out.println(proxyObject);
        System.out.println(method);
        System.out.println(args);
        return method.invoke(proxyObject,args);
    }
}
