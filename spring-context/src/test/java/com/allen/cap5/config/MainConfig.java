package com.allen.cap5.config;

import com.allen.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

;

/**
 * 配置类===配置文件
 * @author 周何圳 2020/3/20 新建
 * @description config
 */
@Configuration
public class MainConfig {

    @Conditional(MacCondition.class)
    @Bean("macAllen")
    public Person macOs(){
        System.out.println("给容器中添加macAllen……");
        return new Person("macAllen",18);
    }

    @Conditional(WinCondition.class)
    @Bean("winAllen")
    public Person windows(){
        System.out.println("给容器中添加winAllen……");
        return new Person("winAllen",10);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linuxAllen")
    public Person linux(){
        System.out.println("给容器中添加linuxAllen……");
        return new Person("linuxAllen",30);
    }

}
