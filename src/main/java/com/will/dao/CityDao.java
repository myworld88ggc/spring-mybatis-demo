package com.will.dao;

import com.will.domain.City;
import org.apache.ibatis.annotations.Param;

public interface CityDao {

    City findByName(@Param("cityName") String cityName);
}