package com.ai.dynamicProxy;

import java.lang.reflect.*;

/**
 * @author songkang
 * @date 2020/8/29
 */
public class ZhangProxy implements InvocationHandler{

    private Person target;

    public ZhangProxy(Person target) {
        this.target = target;
    }

    public Person getTarget() {
        return (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    @Override
    public Person invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强张总前置");
        Person invoke = (Person) method.invoke(target, args);
        System.out.println("增强张总后置");
        return invoke;
    }
}
