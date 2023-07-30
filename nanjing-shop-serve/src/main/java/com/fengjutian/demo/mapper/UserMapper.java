package com.fengjutian.demo.mapper;

import com.fengjutian.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insertUser(User user);

    User getByUserNameAndPassword(User user);
}
