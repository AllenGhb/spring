package com.allen.cap7.config;

import com.allen.cap1.Person;
import com.allen.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 周何圳 2020/4/5 新建
 * @description
 */
@Configuration
@ComponentScan("com.allen.cap7.bean")
public class MainConfigLifeCycle {

    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person……");
        return new Person("person",20);
    }

    //@Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Bike bike(){
        return new Bike();
    }
}
