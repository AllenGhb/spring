package com.allen.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author 周何圳 2020/4/5 新建
 * @description
 */
@Component
public class Train implements InitializingBean, DisposableBean {

    public Train(){
        System.out.println("Train ..... constructor ....");
    }

    /**
     * 当bean销毁时调用此方法
     *
     * @author 周何圳 2020年04月05日 新建
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Train ..... destroy ....");
    }

    /**
     * 当bean属性赋值和初始化完成时调用
     *
     * @author 周何圳 2020年04月05日 新建
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train ...... afterPropertiesSet ...");
    }
}
