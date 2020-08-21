package com.ai.test;

import com.ai.pojo.Order;
import com.ai.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author songkang
 * @date 2020/8/21
 */
public class MybatisTest {


    @Test
    public void oneToOne() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig2.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Order> list = sqlSession.selectList("com.ai.dao.OrderMapper.selectOrder");
        list.forEach(System.out::println);
        sqlSession.close();
    }



    @Test
    public void name() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig2.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectList("");
    }
}
