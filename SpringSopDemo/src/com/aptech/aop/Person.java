package com.aptech.aop;


public class Person implements IPerson {

	@Override
	public void sleep() {
		System.out.println("吃饭中");

	}

	@Override
	public void eating() {
		System.out.println("睡觉中");

	}

}
