package com.sail.rh.dubbo.server.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.sail.rh.dubbo.server.pojo.HouseResources;
import com.sail.rh.dubbo.server.service.HouseResourcesService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @program: sail-rh-manager
 * @description:
 * @author: sail
 * @create: 2019/06/12 19:54
 */

@Service(version = "1.0.0")
public class ApiHouseResourcesServiceImpl implements ApiHouseResourcesService {

    @Autowired
    private HouseResourcesService houseResourcesService;

    @Override
    public int saveHouseResources(HouseResources houseResources) {
        return this.houseResourcesService.saveHouseResources(houseResources);
    }
}
