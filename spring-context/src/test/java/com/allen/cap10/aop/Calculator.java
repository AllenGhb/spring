package com.allen.cap10.aop;

/**
 * @author 周何圳 2020/4/19 新建
 * @description
 */

public class Calculator {

    public int div(int i , int j){
        System.out.println("准备计算……");
        return i/j;
    }
}
