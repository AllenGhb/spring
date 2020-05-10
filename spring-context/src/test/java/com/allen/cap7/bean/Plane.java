package com.allen.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 周何圳 2020/4/5 新建
 * @description
 */
@Component
public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Plane(){
        System.out.println("Plane...constructor...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Plane...init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Plane...destroy...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
