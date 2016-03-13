package com.aptech.aop.staticproxy;

import com.aptech.aop.IPerson;
import com.aptech.aop.Person;

public class PersonTest {
	
	public static void main(String[] args) {
		IPerson proxy = new PersonProxy(new Person());
		proxy.sleep(); //通过静态代理实现
		proxy.eating();
	}

}
