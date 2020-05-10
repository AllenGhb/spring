package com.allen.cap5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author 周何圳 2020/3/22 新建
 * @description cap5
 */
public class LinuxCondition implements Condition {

    /**
     *
     * @param annotatedTypeMetadata 注解信息
     * @param conditionContext 判断条件可以使用的上下文（环境）
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
    	// 能够获取IOC容器正在使用的beanFactory
        ConfigurableListableBeanFactory factory = conditionContext.getBeanFactory();
        // 获取当前的环境变量(包括操作系统)
        Environment environment = conditionContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        if(osName.contains("linux")){
            return true;
        }
        return false;
    }
}
