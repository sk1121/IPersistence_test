package com.ai.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

import java.sql.Connection;
import java.util.Properties;

/**
 * @author songkang
 * @date 2020/8/27
 */
@Intercepts(
        @Signature(type = StatementHandler.class,
                method = "prepare",
                args = {Connection.class,Integer.class})
)
public class MyPlugin implements Interceptor {
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("进行方法增加。。。");
        return invocation.proceed();
    }

    public Object plugin(Object o) {
        System.out.println("加载插件");
        Object wrap = Plugin.wrap(o, this);
        return wrap;
    }

    public void setProperties(Properties properties) {

    }
}
