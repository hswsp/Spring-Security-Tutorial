package com.example.security.dao.oracle;

import com.example.security.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    List<Role> findByUserName(String userName);
}
