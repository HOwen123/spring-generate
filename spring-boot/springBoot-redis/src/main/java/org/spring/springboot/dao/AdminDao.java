package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.Admin;

/**
 * @author chenssy
 * @date 2017/6/4
 * @since v1.0.0
 */
public interface AdminDao {
    Admin findByName(@Param("userName") String userName);
}
