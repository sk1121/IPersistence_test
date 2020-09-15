package com.ai.dynamicProxy;

/**
 * @author songkang
 * @date 2020/8/30
 */
public class Bob implements Person {
    @Override
    public void doSomeThing() {
        System.out.println("Bob doSomeThing！");
    }
}
