package com.example.zhenghe.mapper;

import com.example.zhenghe.model.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    Department getDeptById(Integer id);

    void update(Department department);

    void deleteEmpById(Integer id);
}
