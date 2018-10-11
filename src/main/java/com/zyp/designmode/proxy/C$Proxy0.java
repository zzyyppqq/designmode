package com.zyp.designmode.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * Proxy自动生成的class
 */
/* renamed from: com.sun.proxy.$Proxy0 */
public final class C$Proxy0 extends Proxy implements Subject {
    private static Method m0;
    private static Method m1;
    private static Method m2;
    private static Method m3;

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[]{Class.forName("java.lang.Object")});
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            m3 = Class.forName("com.zyp.extend.proxy.Subject").getMethod("buy", new Class[0]);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
        } catch (Throwable e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public C$Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    public final void buy() {
        RuntimeException e;
        try {
            this.h.invoke(this, m3, null);
        } catch (RuntimeException e3) {
            e = e3;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }
    }

    public final boolean equals(Object obj) {
        RuntimeException e;
        try {
            return ((Boolean) this.h.invoke(this, m1, new Object[]{obj})).booleanValue();
        } catch (RuntimeException e3) {
            e = e3;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }
        return false;
    }

    public final int hashCode() {
        RuntimeException e;
        try {
            return ((Integer) this.h.invoke(this, m0, null)).intValue();
        } catch (RuntimeException e3) {
            e = e3;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }
        return 0;
    }

    public final String toString() {
        RuntimeException e;
        try {
            return (String) this.h.invoke(this, m2, null);
        }  catch (RuntimeException e3) {
            e = e3;
            throw e;
        } catch (Throwable th) {
            UndeclaredThrowableException undeclaredThrowableException = new UndeclaredThrowableException(th);
        }
        return null;
    }
}