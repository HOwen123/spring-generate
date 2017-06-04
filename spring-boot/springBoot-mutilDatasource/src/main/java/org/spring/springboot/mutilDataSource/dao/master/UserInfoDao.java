package org.spring.springboot.mutilDataSource.dao.master;

import org.spring.springboot.mutilDataSource.domain.master.UserInfo;

import java.util.List;

/**
 * @author chenssy
 * @date 2017/6/3
 * @since v1.0.0
 */
public interface UserInfoDao {

    List<UserInfo> getAllUser();
}
