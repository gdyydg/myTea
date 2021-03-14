package mms.service;

import mms.entity.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
   Long insertCity(City city);

   City showCity(String id);
}
