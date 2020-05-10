package com.allen.cap8;

import com.allen.cap8.bean.Bird;
import com.allen.cap8.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author 周何圳 2020/3/20 新建
 * @description
 */
public class Cap8Test {

    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
        Bird bird = (Bird) context.getBean("bird");
        System.out.println(bird);
        System.out.println("IOC容器创建完成……");
        ConfigurableEnvironment env = context.getEnvironment();
        System.out.println(env.getProperty("bird.color"));
        context.close();
        System.out.println("IOC容器关闭");

    }

}
