package com.sail.rh.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: sail-rh-manager
 * @description:
 * @author: sail
 * @create: 2019/06/12 19:30
 */

@MapperScan("com.sail.rh.dubbo.server.mapper")
@Configuration
public class MybatisConfig {
}
