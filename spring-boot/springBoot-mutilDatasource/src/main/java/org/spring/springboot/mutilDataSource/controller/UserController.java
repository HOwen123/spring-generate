package org.spring.springboot.mutilDataSource.controller;

import org.spring.springboot.mutilDataSource.domain.cluster.Admin;
import org.spring.springboot.mutilDataSource.domain.master.UserInfo;
import org.spring.springboot.mutilDataSource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenssy
 * @date 2017/6/3
 * @since v1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/getAllUser")
    public List<UserInfo> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("/admin/getAllAdmin")
    public List<Admin> getAllAdmin(){
        return userService.getAllAdmin();
    }
}
