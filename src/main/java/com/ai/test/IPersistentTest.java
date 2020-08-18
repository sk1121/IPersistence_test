package com.ai.test;

import com.ai.dao.UserMapper;
import com.ai.io.Resources;
import com.ai.pojo.User;
import com.ai.sqlsession.SqlSession;
import com.ai.sqlsession.SqlSessionFactory;
import com.ai.sqlsession.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.omg.CORBA.ARG_OUT;

import java.io.InputStream;
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
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectList();
        users.forEach(System.out::println);
        System.out.println("=================");
        User user = new User();
        user.setId(1);
        user.setName("asd");
        User u2 = userMapper.selectOne(user);
        System.out.println(u2);
    }
}
