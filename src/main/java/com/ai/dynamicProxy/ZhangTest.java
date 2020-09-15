package com.ai.dynamicProxy;

import org.junit.Test;

/**
 * @author songkang
 * @date 2020/8/29
 */
public class ZhangTest {

    @Test
    public void t1() {
        Person target = new ZhangProxy(new Zhang()).getTarget();
        target.doSomeThing();
    }
}
