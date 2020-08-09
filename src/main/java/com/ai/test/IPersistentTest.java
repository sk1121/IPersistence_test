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
import java.util.List;

/**
 * @author songkang
 * @Date 2020/8/7
 */
public class IPersistentTest {


    @Test
    public void test() throws PropertyVetoException, DocumentException {
        InputStream in = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.builder(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("user.selectList");


    }
}
