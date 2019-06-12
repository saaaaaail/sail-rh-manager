package com.sail.rh.dubbo.server;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @program: sail-rh-manager
 * @description:
 * @author: sail
 * @create: 2019/06/12 19:58
 */

@SpringBootApplication
public class DubboProvider {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProvider.class)
                .web(WebApplicationType.NONE)//非web应用
                .run(args);
    }
}
