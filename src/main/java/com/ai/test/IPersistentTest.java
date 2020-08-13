package com.ai.test;

import com.ai.io.Resources;
import com.ai.pojo.User;
import com.ai.sqlsession.SqlSession;
import com.ai.sqlsession.SqlSessionFactory;
import com.ai.sqlsession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.List;

/**
 * @author songkang
 * @Date 2020/8/7
 */
public class IPersistentTest {


    @Test
    public void test() throws Exception {
        InputStream in = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.builder(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        List<User> list = sqlSession.selectList("user.selectList",user);
        list.forEach(System.out::println);
    }
}
