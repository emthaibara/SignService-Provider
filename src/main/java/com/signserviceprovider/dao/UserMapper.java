package com.signserviceprovider.dao;

import com.signserviceprovider.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    int deleteByPrimaryKey(String phonenumber);

    int insert(User record);

    User selectByPrimaryKey(String phonenumber);

    User selectByPrimaryKeyIdCard(String idcard);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}