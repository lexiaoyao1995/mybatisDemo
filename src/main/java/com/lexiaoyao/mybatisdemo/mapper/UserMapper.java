package com.lexiaoyao.mybatisdemo.mapper;

import com.lexiaoyao.mybatisdemo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository 添加防止mapper注入时飙红，但是不会影响程序运行
 */
@Repository
public interface UserMapper {

    //    void insertUser(User user) throws DataAccessException;
    void insertUser(User user);

    List<User> listAll();

    void update(User user);

    void deleteById(@Param("id") Integer id);

}
