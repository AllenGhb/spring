package com.allen.cap2;

import com.allen.cap2.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 周何圳 2020/3/20 新建
 * @description cap2
 */
public class Cap2Test {


    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }

    }

}
