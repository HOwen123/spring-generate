package org.spring.springboot.controller;

import org.spring.springboot.domain.Admin;
import org.spring.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenssy
 * @date 2017/6/4
 * @since v1.0.0
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("admin/getAdminByName")
    public Admin getAdminByName(@RequestParam(value = "name") String name){
        return adminService.getAdminByName(name);
    }
}
