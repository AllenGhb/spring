package com.allen.cap6.config;

import com.allen.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 周何圳 2020/3/22 新建
 * @description
 */
public class AllenFactoryBean implements FactoryBean<Monkey> {

    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton(){
        return false;
    }
}
