package com.sail.rh.dubbo.server.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: sail-rh-manager
 * @description:
 * @author: sail
 * @create: 2019/06/12 16:48
 */

@Data
public abstract class BasePojo implements Serializable {

    private Date created;
    private Date updated;
}
