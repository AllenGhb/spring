package com.allen.cap1.bean;

import org.springframework.beans.factory.BeanNameAware;

public class User implements BeanNameAware {

	private String id;

	private String name;

	private int age;

	public void setBeanName(String beanName) {
		//ID保存BeanName的值
		id=beanName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}