package org.spring.springboot.mutilDataSource.service.impl;

import org.spring.springboot.mutilDataSource.dao.cluster.AdminDao;
import org.spring.springboot.mutilDataSource.dao.master.UserInfoDao;
import org.spring.springboot.mutilDataSource.domain.cluster.Admin;
import org.spring.springboot.mutilDataSource.domain.master.UserInfo;
import org.spring.springboot.mutilDataSource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenssy
 * @date 2017/6/3
 * @since v1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private AdminDao adminDao;

    @Override
    public List<UserInfo> getAllUser() {
        return userInfoDao.getAllUser();
    }

    @Override
    public List<Admin> getAllAdmin() {
        return adminDao.getAllAdmin();
    }
}
