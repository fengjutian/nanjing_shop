package com.fengjutian.demo.service;

import com.fengjutian.demo.entity.Address;
import com.fengjutian.demo.entity.User;
import com.fengjutian.demo.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }


    public User getByUserNameAndPassword(User user) {
        return userMapper.getByUserNameAndPassword(user);
    }

    public int delUser(User user) {
        return userMapper.delUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
