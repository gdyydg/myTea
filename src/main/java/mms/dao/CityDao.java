package mms.dao;

import mms.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityDao {
    Long saveCity(City city);

    City selectCityById(@Param("id")String id);
}
