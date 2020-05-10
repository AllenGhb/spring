package com.allen.cap6;

import com.allen.cap6.bean.Monkey;
import com.allen.cap6.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 周何圳 2020/3/20 新建
 * @description
 */
public class Cap6Test {


    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        System.out.println("IOC容器创建完成……");
        Monkey monkey = (Monkey) context.getBean("&allenFactoryBean");
        System.out.println("bean的类型="+monkey.getClass());
		Monkey monkey1 = (Monkey) context.getBean("allenFactoryBean");
		System.out.println(monkey.hashCode());
		System.out.println(monkey1.hashCode());
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }

    }

}
