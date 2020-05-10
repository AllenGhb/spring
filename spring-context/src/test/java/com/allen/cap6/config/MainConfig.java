package com.allen.cap6.config;

import com.allen.cap1.Person;
import com.allen.cap6.bean.Cat;
import com.allen.cap6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

;

/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
@Import(value = {Dog.class, Cat.class,AllenImportSelector.class,AllenImportBeanDefinitionRegistrar.class})
/*@Import(value = {Dog.class, Cat.class,AllenImportSelector.class})*/
//@Import({Dog.class, Cat.class})
public class MainConfig {

    /**
     * BeanFactory: 从我们容器中获取实例化后的bean
     * FactoryBean：可以把我们Java实例Bean通过FactoryBean注入到容器中
     * 给容器中注册组件的方式
     * 1、@Bean: [导入第三方的类或包的组件],比如Person为第三方的类，需要在我们的IOC容器中使用
     * 2、包扫描+组件的标注注解(@ComponentScan:@Controller @Service @Repository @Component)
     * 一般针对我们自己写的类
     * 3、@Import:[快速给容器导入一个组件]
     *         a,@Import(要导入到容器中的组件)：容器会自动注册这个组件，bean 的id为全类名
     *         b,ImportSelector:是一个接口，返回需要导入到容器的组件的全类名数组
     *         c,ImportBeanDefinitionRegistrar:可以手动添加组件到IOC容器，所有bean的注册可以使用BeanDefinitionRegistry
     * 4、使用Spring提供的FactoryBean（工厂bean）进行注册
     *
     * @author 周何圳 2020年03月22日 新建
     */
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person……");
        return new Person("person",18);
    }

    @Bean("allen")
    public Person allen(){
        System.out.println("给容器中添加allen……");
        return new Person("allen",10);
    }

    @Bean
    public AllenFactoryBean allenFactoryBean(){
        return new AllenFactoryBean();
    }


}
