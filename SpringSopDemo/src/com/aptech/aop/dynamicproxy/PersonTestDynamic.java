package com.aptech.aop.dynamicproxy;

import com.aptech.aop.IPerson;
import com.aptech.aop.Person;

/**
 * 测试动态代理
 * @author jerry
 * @date Mar 12, 2016
 */
public class PersonTestDynamic {
	
	public static void main(String[] args) {
		//返回代理类，代理类是JVM在内存中动态创建的，该类实现传入的接口数据的全部方法
		IPerson person = (IPerson)DynaProxyFactory.getProxy(new Person());
		
		person.sleep();
		person.eating();
	}

}
