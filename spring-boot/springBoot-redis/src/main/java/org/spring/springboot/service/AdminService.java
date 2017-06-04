package org.spring.springboot.service;

import org.spring.springboot.domain.Admin;

/**
 * @author chenssy
 * @date 2017/6/4
 * @since v1.0.0
 */
public interface AdminService {

    Admin getAdminByName(String userName);
}
