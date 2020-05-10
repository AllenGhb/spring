package com.allen.cap7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 周何圳 2020/4/5 新建
 * @description
 */
@Component
public class Jeep {

    public Jeep(){
        System.out.println("Jeep...constructor...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Jeep...init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Jeep...destroy...");
    }
}
