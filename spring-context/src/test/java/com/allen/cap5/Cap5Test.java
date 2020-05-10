package com.allen.cap5;

import com.allen.cap1.Person;
import com.allen.cap5.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author 周何圳 2020/3/20 新建
 * @description
 */
public class Cap5Test {


    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器创建完成……");
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for(String beanName : beanNamesForType){
			System.out.println(beanName);
		}

		Map<String,Person> personBean = context.getBeansOfType(Person.class);
		System.out.println(personBean);

    }

}
