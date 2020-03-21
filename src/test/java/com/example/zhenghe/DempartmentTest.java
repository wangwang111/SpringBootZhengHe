package com.example.zhenghe;

import com.example.zhenghe.mapper.DepartmentMapper;
import com.example.zhenghe.model.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DempartmentTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void contextLoads() {
        Department deptById = departmentMapper.getDeptById(1);
        System.out.println(deptById);
    }

}
