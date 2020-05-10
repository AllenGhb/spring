package com.allen.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author 周何圳 2020/4/5 新建
 * @description
 */
@Component
public class AllenBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..." +beanName +"..." +bean);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // bean 返回一个对象（传过来的对象）
        // 在初始化方法调用之前进行后置处理工作
        // 什么时候调用它：在init-method=init之前调用
        System.out.println("postProcessAfterInitialization..." +beanName +"..."+bean);
        return null;
    }
}
