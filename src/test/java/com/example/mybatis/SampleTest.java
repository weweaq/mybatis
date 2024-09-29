package com.example.mybatis;

import com.example.mybatis.dao.mapper.UserInfoMapper;
import com.example.mybatis.dao.vo.UserInfoZhangwei;
import jakarta.annotation.Resource;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class SampleTest {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserInfoZhangwei> userInfoZhangweis = userInfoMapper.selectList(null);
        userInfoZhangweis.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        System.out.println(("----- insert method test ------"));
        int insertCnt = userInfoMapper.insertBatchSomeColumn(Lists.list(
                new UserInfoZhangwei("zhangwei", 20, "zhangwei@163.com"),
        new UserInfoZhangwei("zhangwei", 20, "zhangwei@163.com")));
        System.out.println("insert cnt: " + insertCnt);
    }
}
