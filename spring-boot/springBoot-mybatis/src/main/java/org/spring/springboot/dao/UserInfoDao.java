package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.spring.springboot.domain.UserInfo;

import java.util.List;

/**
 * @author chenssy
 * @date 2017/6/3
 * @since v1.0.0
 */
@Mapper
public interface UserInfoDao {

    @Select("select * from user_info")
    @Results({
            @Result(property = "country", column = "country"),
            @Result(property = "region", column = "region"),
            @Result(property = "city", column = "city"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "eyeColor", column = "eye_color"),
            @Result(property = "age", column = "age"),
    })
    List<UserInfo> getAll();
}
