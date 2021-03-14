package mms.service.impl;

import mms.dao.CityDao;
import mms.entity.City;
import mms.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;
    /**
    * @description: TODO 新增城市
    * @params: [city]
    * @return: void
    * @author: Mms
    * @dateTime: 2021/2/2 14:28
     */
    @Override
    public Long insertCity(City city) {
        Long id = cityDao.saveCity(city);
        return id;
    }
    /**
    * @description: 查询一个城市
    * @params: [id]
    * @return: mms.entity.City
    * @author: Mms
    * @dateTime: 2021/2/20 17:22
     */

    @Override
    public City showCity(String id) {
        City city = cityDao.selectCityById(id);
        return city;
    }
}
