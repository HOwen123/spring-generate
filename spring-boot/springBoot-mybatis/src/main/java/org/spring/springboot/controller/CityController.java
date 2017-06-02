package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenssy
 * @date 2017/6/2
 * @since v1.0.0
 */
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/city/getCity")
    public City getCity(@RequestParam(value = "cityName")String cityName){
        return cityService.getCityByName(cityName);
    }
}
