package mms.entity;

import org.hibernate.annotations.Entity;

import java.io.Serializable;
/**
* @description: TODO
* @params:
* @return:
* @author: Mms
* @dateTime: 2021/2/2 11:23
 */

public class City implements Serializable {
    private Long id;                      //城市id
    private String cityName;                //城市名称
    private String description;             //城市描述

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
