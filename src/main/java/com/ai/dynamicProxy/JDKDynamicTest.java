package com.ai.dynamicProxy;

import org.junit.Test;

/**
 * @author songkang
 * @date 2020/8/30
 */
public class JDKDynamicTest {

    @Test
    public void t1() {
        Person target = new JDKDynamicProxy(new Bob()).getTarget();
        target.doSomeThing();
    }
}
