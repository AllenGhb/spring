package com.allen.cap10;

import com.allen.cap10.aop.Calculator;
import com.allen.cap10.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 周何圳 2020/3/20 新建
 * @description
 */
public class Cap10Test {

    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        Calculator calculator = context.getBean(Calculator.class);
        int result = calculator.div(4,1);
        System.out.println(result);

        System.out.println("IOC容器创建完成……");

        context.close();
        System.out.println("IOC容器关闭");

    }

}
