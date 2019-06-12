package com.sail.rh.dubbo.server.service.impl;

import com.sail.rh.dubbo.server.pojo.HouseResources;
import com.sail.rh.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: sail-rh-manager
 * @description:
 * @author: sail
 * @create: 2019/06/12 19:44
 */

@Service
@Transactional
public class HouseResourcesServiceImpl extends BaseServiceImpl implements HouseResourcesService {

    @Override
    public int saveHouseResources(HouseResources houseResources) {

        //添加校验信息
        if (StringUtils.isBlank(houseResources.getTitle())){
            //不合要求
            return -1;
        }

        return super.save(houseResources);

    }
}
