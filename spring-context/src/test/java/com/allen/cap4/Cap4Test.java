package com.allen.cap4;

import com.allen.cap1.Person;
import com.allen.cap4.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 周何圳 2020/3/20 新建
 * @description
 */
public class Cap4Test {


    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器创建完成……");
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
		System.out.println("准备获取bean对象");
        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

}
