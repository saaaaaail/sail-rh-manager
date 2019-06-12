package com.sail.rh.dubbo.server.api;

import com.sail.rh.dubbo.server.pojo.HouseResources;

/**
 * @program: sail-rh-manager
 * @description: 提供房源服务的接口
 * @author: sail
 * @create: 2019/06/12 18:43
 */

public interface ApiHouseResourcesService {

    /**
     *
     * @param houseResources
     *
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    int saveHouseResources(HouseResources houseResources);
}
