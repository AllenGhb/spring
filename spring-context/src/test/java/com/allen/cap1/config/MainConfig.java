package com.allen.cap1.config;

import com.allen.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
public class MainConfig {

    /**
     * 给容器中注册一个bean
     * @author 周何圳 2020年03月20日 新建
     */
    @Bean(name = {"personName"})
    public Person person(){
        return new Person("allen",19);
    }
}
