package com.allen.cap9.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

;

/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
@ComponentScan({"com.allen.cap9.controller","com.allen.cap9.service",
        "com.allen.cap9.dao","com.allen.cap9.bean"})
public class MainConfig {
    //Primary 自动装配时默认首选的bean
    /*@Primary
    @Bean("allenDao2")
    public AllenDao allenDao(){
        AllenDao dao =  new AllenDao();
        dao.setFlag("2");
        return dao;
    }*/

}
