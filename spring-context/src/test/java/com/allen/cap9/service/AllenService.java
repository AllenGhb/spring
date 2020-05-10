package com.allen.cap9.service;

import com.allen.cap9.dao.AllenDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 周何圳 2020/4/18 新建
 * @description
 */
@Service
public class AllenService {
    //@Qualifier("allenDao2")
    // Resource 1、不支持与Primary使用 2、不支持Autowired的false，没有bean就报错
    //@Autowired(required = false)
    // Inject 需要额外引用javax.inject jar包 支持primary ，不支持Autowired的false
    @Resource
    //@Inject
    private AllenDao allenDao;

    public void printIn(){
        System.out.println(allenDao);
    }
}
