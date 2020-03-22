package com.example.zhenghe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户")
public class User {

    @ApiModelProperty("用户ID")
    private int id;
    @ApiModelProperty("用户名字")
    private String username;
    @ApiModelProperty("用户年龄")
    private int age;
}
