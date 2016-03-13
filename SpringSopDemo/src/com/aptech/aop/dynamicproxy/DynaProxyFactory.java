package com.aptech.aop.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 生产代理对象的工厂 
 * @author jerry
 * @date Mar 12, 2016
 */
public class DynaProxyFactory {
	
	/**
	 * obj: 被代理的对象
	 */
	public static Object getProxy(Object obj){
		
		DynaProxyHandler handler = new DynaProxyHandler();
		handler.setTarget(obj);
		
		Object proxy = Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				obj.getClass().getInterfaces(), handler);
			
		return proxy;
		
	}

}
