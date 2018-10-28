package com.wangzhen.spb.mediatypejson.controller;

import com.wangzhen.spb.mediatypejson.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author wangzhen
 * @Date 2018/10/28 下午2:33
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return new User(id,"waylau", "waylau521@gmail.com");
    }
}
