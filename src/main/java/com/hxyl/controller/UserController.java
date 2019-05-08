package com.hxyl.controller;

import com.hxyl.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setAge(20);
        user.setEmail("yytlovelife@126.com");
        user.setUsername("yyt");
        user.setPassword("123456");
        list.add(user);
        return list;
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User hello(@PathVariable String id){
        User user = new User();
        user.setAge(20);
        user.setEmail("yytlovelife@126.com");
        user.setUsername("yyt");
        user.setPassword("123456");
        return user;
    }


    /**
     * 添加一个
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String postUser(){
        System.out.println("创建一个User");
        User user = new User();
        user.setAge(25);
        user.setEmail("yytlovelife@126.com");
        user.setUsername("");
        user.setPassword("123456");
        System.out.println(user);
        return "success";
    }

    /**
     * 更新user
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String putUser(@PathVariable String id){
        System.out.println("更新一个User");
        User user = new User();
        user.setAge(25);
        user.setEmail("yytlovelife@126.com");
        user.setUsername("更新");
        user.setPassword("123456");
        System.out.println(user);
        return "success";
    }

    /**
     * 更新user
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id){
        System.out.println("删除一个User");
        User user = new User();
        user.setAge(25);
        user.setEmail("yytlovelife@126.com");
        user.setUsername("删除");
        user.setPassword("123456");
        System.out.println(user);
        return "success";
    }



}
