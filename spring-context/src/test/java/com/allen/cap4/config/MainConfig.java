package com.allen.cap4.config;

import com.allen.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

;

/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
public class MainConfig {

    /**
     * 懒加载：主要针对单实例bean，默认在容器启动时创建对象
     * 容器启动时不创建对象，仅当第一次使用（获取）bean时才创建对象
     * @author 周何圳 2020年03月21日 新建
     */
    @Lazy
    @Bean
    public Person person(){
        System.out.println("给容器中添加person……");
        return new Person("allen",18);
    }

}
