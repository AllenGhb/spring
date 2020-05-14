package com.allen.cap1;

import com.allen.cap1.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 周何圳 2020/3/20 新建
 * @description com.allen.cap1
 */
public class MainTest2 {


    public static void main(String[] args) {
        // 把beans.xml加载到容器中
        /*ApplicationContext context = new ClassPathXmlApplicationContext("com.allen/beans.xml");*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        // 从容器中获取值
        Person person = (Person) context.getBean("personName");
        System.out.println(person);
		Person person1 = (Person) context.getBean("personName");
		System.out.println(person1);

        String[] namesForBean = context.getBeanNamesForType(Person.class);
        for(String name : namesForBean){
            System.out.println(name);
        }

    }

}
