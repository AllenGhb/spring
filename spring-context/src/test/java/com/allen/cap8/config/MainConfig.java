package com.allen.cap8.config;

import com.allen.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

;

/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
@PropertySource(value = "classpath:/cap8.properties")
public class MainConfig {

    @Bean(name = "bird")
    public Bird getBird(){
        return new Bird();
    }


}
