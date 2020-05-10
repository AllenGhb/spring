package com.allen.cap7;

import com.allen.cap7.bean.Bike;
import com.allen.cap7.config.MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 周何圳 2020/3/20 新建
 * @description
 */
public class Cap7Test {

    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);

        System.out.println("IOC容器创建完成……");
        Bike bike = (Bike) context.getBean("bike");
        context.close();
        System.out.println("IOC容器关闭");

    }

}
