package com.allen.cap6.config;

import com.allen.cap6.bean.Fish;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 周何圳 2020/3/22 新建
 * @description
 */
public class AllenImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param beanDefinitionRegistry BeanDefinition 注册类
     *                                 把所有需要添加到容器中的bean加入
     * @param annotationMetadata 当前类的注解信息
     * @author 周何圳 2020年03月22日 新建
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean dogBean = beanDefinitionRegistry.containsBeanDefinition("com.allen.cap6.bean.Dog");
        boolean pigBean = beanDefinitionRegistry.containsBeanDefinition("com.allen.cap6.bean.Pig");
        if(dogBean && pigBean){
            // 对于我们要注册的bean，给bean进行封装
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Fish.class);
            beanDefinitionRegistry.registerBeanDefinition("fish",rootBeanDefinition);
        }
    }
}
