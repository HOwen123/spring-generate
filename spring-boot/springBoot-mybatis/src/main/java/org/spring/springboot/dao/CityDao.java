package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

/**
 * @author chenssy
 * @date 2017/6/2
 * @since v1.0.0
 */
public interface CityDao {

    City findByName(@Param("cityName")String cityName);
}
