package com.signserviceprovider.dao;

import com.signserviceprovider.pojo.RegisteredSchool;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RegisteredSchoolMapper {
    int deleteByPrimaryKey(String registeredschool);

    int insert(RegisteredSchool record);

    RegisteredSchool selectByPrimaryKey(String registeredschool);

    List<RegisteredSchool> selectAll();

    int updateByPrimaryKey(RegisteredSchool record);
}