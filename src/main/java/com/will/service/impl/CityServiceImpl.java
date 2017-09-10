package com.will.service.impl;

import com.will.dao.CityDao;
import com.will.domain.City;
import com.will.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Will on 2017/9/10.
 */
@Service
public class CityServiceImpl implements CityService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
