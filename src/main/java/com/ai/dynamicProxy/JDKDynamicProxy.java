package com.ai.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author songkang
 * @date 2020/8/30
 */
public class JDKDynamicProxy implements InvocationHandler {

    private Person target;

    public JDKDynamicProxy(Person person) {
        this.target = person;
    }

    public Person getTarget() {
        return (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Person invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强");
        return (Person)method.invoke(target,args);
    }
}
