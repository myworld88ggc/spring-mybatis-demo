package com.will.service;

/**
 * Created by Will on 2017/9/10.
 */

import com.will.domain.City;

/**
 * 城市业务逻辑接口类
 *
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}