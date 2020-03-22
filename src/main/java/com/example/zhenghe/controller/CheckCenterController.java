package com.example.zhenghe.controller;


import com.example.zhenghe.model.Department;
import com.example.zhenghe.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Api(tags = "客服接口")
@RestController
@RequestMapping("/check_center")
public class CheckCenterController {

    // 创建线程安全的Map
    static Map<Integer, User> users = Collections.synchronizedMap(new HashMap<Integer, User>());

    @ApiOperation(value = "获取客服", notes = "根据cid获取客服")
    @ApiImplicitParam(name = "cid", value = "客户id", required = true, dataType = "String")
    @GetMapping("/getCenter")
    public Map getCenter(String cid) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("cid", cid);
        map.put("name", "客服");
        return map;
    }

    @ApiOperation(value = "获取客服", notes = "根据cid获取客服")
    @PostMapping("/getCenter2/{cid}")
    public Map getCenter2(@ApiParam("客户ID") @PathVariable String cid) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("cid", cid);
        map.put("name", "客服");
        return map;
    }


    @ApiOperation(value = "测试接口api", notes = "根据cid获取客服信息，this is test api")
    @PostMapping("/getDepartment")
    public Map<String, String> getDepartment(Department department) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "客服");
        return map;
    }

    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    @PostMapping("users")
    public Map<String, String> getUserList(@RequestBody User user) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("aa", "小红");
        map.put("bb", "小明");
        return map;
    }

}
