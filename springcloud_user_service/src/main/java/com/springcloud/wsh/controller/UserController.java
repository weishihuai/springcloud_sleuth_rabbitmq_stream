package com.springcloud.wsh.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: UserController
 * @ProjectName springcloud_sleuth_rabbitmq_stream
 * @Description: 测试Controller
 * @Author WeiShiHuai
 * @Date 2018/9/28 13:52
 */
@RestController
public class UserController {

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "hello , i am " + name;
    }

}
