package org.spring.springboot.mutilDataSource.service;

import org.spring.springboot.mutilDataSource.domain.cluster.Admin;
import org.spring.springboot.mutilDataSource.domain.master.UserInfo;

import java.util.List;

/**
 * @author chenssy
 * @date 2017/6/3
 * @since v1.0.0
 */
public interface UserService {
    List<UserInfo> getAllUser();

    List<Admin> getAllAdmin();
}
