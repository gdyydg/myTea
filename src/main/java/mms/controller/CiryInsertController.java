package mms.controller;

import mms.entity.City;
import mms.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CiryInsertController {
    @Autowired
    private CityService cityService;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //新增一个城市
    @RequestMapping("/registCity")
    @ResponseBody
    public String registCity(City city) {
        city.setCityName("太原");
        city.setDescription("古城");
        Long id = cityService.insertCity(city);
        System.out.println(id);
        return "error";
    }

    //查询一个城市
    //http://localhost:8081/mms/showCity/1
    @RequestMapping("/showCity/{id}")
    @ResponseBody
    public String showCity(@PathVariable("id") String id) {
        //id="1";
        String[] s = new String[]{"1"};
        String[] s1 = new String[1];
        City city = cityService.showCity(id);
        return city.getCityName();
    }

    //测试jdbc
    @RequestMapping("/test/jdbc")
    @ResponseBody
    public String testJdbc() {
        String sql = "select * from city where id='1'";
        List<City> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
        return query.get(0).getCityName();
    }
}
