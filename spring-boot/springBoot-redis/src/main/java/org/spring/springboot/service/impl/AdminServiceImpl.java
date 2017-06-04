package org.spring.springboot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.dao.AdminDao;
import org.spring.springboot.domain.Admin;
import org.spring.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author chenssy
 * @date 2017/6/4
 * @since v1.0.0
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 如果缓存存在，则从缓存中获取，否则从数据库中获取并保持到缓存中
     *
     * @author chenssy
     * @date 2017-06-04
     * @since v1.0.0
     */
    @Override
    public Admin getAdminByName(String userName) {
        String redisKey = "admin_" + userName;

        // 缓存中是否存在
        ValueOperations<String, Admin> operations = redisTemplate.opsForValue();

        Admin  admin = null;
        if(redisTemplate.hasKey(redisKey)){
            admin = operations.get(redisKey);
            LOGGER.info("从缓冲中获取数据===>" + admin.toString());
        }else{
            admin = adminDao.findByName(userName);

            operations.set(redisKey, admin, 60, TimeUnit.SECONDS);
            LOGGER.info("从数据库中获取数据===>" + admin.toString());
        }

        return admin;
    }
}
