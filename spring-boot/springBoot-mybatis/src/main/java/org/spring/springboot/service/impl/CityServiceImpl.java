package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenssy
 * @date 2017/6/2
 * @since v1.0.0
 */
@Service("cityService")
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Override
    public City getCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
