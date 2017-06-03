package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.dao.UserInfoDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.UserInfo;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenssy
 * @date 2017/6/2
 * @since v1.0.0
 */
@Service("cityService")
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public City getCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    @Override
    public List<UserInfo> getAllUser() {
        return userInfoDao.getAll();
    }
}
