package com.allen.cap3.config;

import com.allen.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

;

/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
public class MainConfig {

	/**
	 * prototype 多实例 IOC容器启动的时候,并不会去调用方法创建对象，而是每次获取bean才会创建
	 * singleton 单实例(默认) IOC容器启动的时候会调用方法创建对象到容器中
	 * request 主要针对web应用，递交一次请求创建一个实例
	 * session 同一个session创建一个实例
	 *
	 */
    //@Scope(value ="prototype")
    @Bean
    public Person person(){
		System.out.println("给容器中添加person……");
        return new Person("allen",18);
    }

}
