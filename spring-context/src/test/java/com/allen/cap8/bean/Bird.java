package com.allen.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author 周何圳 2020/4/18 新建
 * @description
 */
public class Bird {

    // 使用@Value进行赋值1、基本字符 2、springEL表达式 3、读取配置文件
    @Value("allen")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${bird.color}")
    private String color;

    public Bird() {
    }

    public Bird(String name,Integer age,String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
