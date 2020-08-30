package com.lexiaoyao.mybatisdemo;

import com.lexiaoyao.mybatisdemo.domain.Teacher;
import com.lexiaoyao.mybatisdemo.domain.User;
import com.lexiaoyao.mybatisdemo.enums.Gender;
import com.lexiaoyao.mybatisdemo.mapper.TeacherMapper;
import com.lexiaoyao.mybatisdemo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.List;
import java.util.zip.DataFormatException;

@SpringBootTest
@Slf4j
class MybatisdemoApplicationTests {

    @Autowired
    private UserMapper mapper;

    @Test
    void test() {
        User asd = new User(1123, "asd", 12, Gender.Unknown);
        List<User> users = mapper.listAll();
        mapper.insertUser(asd);
        System.out.println(users);
    }

}
