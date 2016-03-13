package com.aptech.aop3;

import java.lang.reflect.Method;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

/**
 * 业务方法执行之后的处理
 * @author jerry
 * @date Mar 12, 2016
 */
public class AfterAdvice implements AfterReturningAdvice {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("目标方法执行后的返回值" + returnValue);
		System.out.println("目标方法名称" + method);
		System.out.println("目标对象" + target);
		logger.info("目标方法执行后的时间" + new Date());
		

	}

}
