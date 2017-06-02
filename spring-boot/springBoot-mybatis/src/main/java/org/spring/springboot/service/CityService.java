package org.spring.springboot.service;

import org.spring.springboot.domain.City;

/**
 * @author chenssy
 * @date 2017/6/2
 * @since v1.0.0
 */
public interface CityService {
    City getCityByName(String cityName);
}
