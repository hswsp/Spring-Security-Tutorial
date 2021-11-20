package com.example.security.dao.oracle;

import com.example.security.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByUserName(String userName);
}
