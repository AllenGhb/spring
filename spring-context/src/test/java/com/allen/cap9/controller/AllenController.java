package com.allen.cap9.controller;

import com.allen.cap9.service.AllenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 周何圳 2020/4/18 新建
 * @description
 */
@Controller
public class AllenController {

    @Autowired
    private AllenService service;
}
