package com.allen.cap9;

import com.allen.cap9.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 周何圳 2020/3/20 新建
 * @description
 */
public class Cap9Test {

    public @Test
	void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        // 直接从容器中取和使用Autowired取比较
        /*AllenService service = context.getBean(AllenService.class);
        service.printIn();
        AllenDao allenDao = context.getBean(AllenDao.class);
        System.out.println(allenDao);*/



        System.out.println("IOC容器创建完成……");

        context.close();
        System.out.println("IOC容器关闭");

    }

}
