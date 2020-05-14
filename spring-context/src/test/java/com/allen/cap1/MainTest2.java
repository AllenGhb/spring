package com.allen.cap1;

import com.allen.cap1.bean.User;
import com.allen.cap1.bean.User2;
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

		/*User user=context.getBean(User.class);
		System.out.println(String.format("实现了BeanNameAware接口的信息BeanId=%s,所有信息=%s",user.getId(),user.toString()));

		User2 user2=context.getBean(User2.class);
		System.out.println(String.format("未实现BeanNameAware接口的信息BeanId=%s,所有信息=%s",user2.getId(),user2.toString()));*/

    }

}
