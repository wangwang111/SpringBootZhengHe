package com.example.zhenghe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "部门")
public class Department implements Serializable {

    @ApiModelProperty("部门ID")
    private Integer id;
    @ApiModelProperty("部门名称")
    private String departmentName;
}
