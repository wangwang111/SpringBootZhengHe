package com.example.zhenghe.controller;

import com.example.zhenghe.model.Department;
import com.example.zhenghe.model.Employee;
import com.example.zhenghe.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dep")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("{id}")
    public Department getEmployee(@PathVariable("id") Integer id) {
        Department dep = departmentService.getDep(id);
        return dep;
    }

    @GetMapping("update")
    public Department update(Department department) {
        return departmentService.updateDep(department);
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        departmentService.deleteEmp(id);
        return "success";
    }
}
