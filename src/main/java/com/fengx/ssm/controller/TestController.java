package com.fengx.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: 冯晓
 * @create: 2021-06-12
 **/
// 注册为控制器bean
@Controller
// 请求路径
@RequestMapping(value = "/test")
public class TestController {
    // 返回json数据
    @ResponseBody
    @RequestMapping(value = "/hello", produces = "application/json;charset=UTF-8")
    public String hello(){
        return "Hello!你好呀，SSM";
    }
}