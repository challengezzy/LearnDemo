package com.aptech.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * 通过实现InvocationHandler接口，实现动态代理的功能
 * @author jerry
 * @date Mar 12, 2016
 */
public class DynaProxyHandler implements InvocationHandler {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	private Object target; //被代理对象
	
	public void setTarget(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		logger.info("开始执行时间"+new Date());
		
		Object result = method.invoke(target, args);//invoke执行
		logger.info("结束执行时间"+new Date());
		
		return result;
	}

}
