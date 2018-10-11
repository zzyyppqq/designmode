package com.zyp.designmode.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Object objectProxy;

    public Object newProxyInstance(Object objectProxy){
        this.objectProxy = objectProxy;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(objectProxy.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        return method.invoke(objectProxy,args);
    }
}
