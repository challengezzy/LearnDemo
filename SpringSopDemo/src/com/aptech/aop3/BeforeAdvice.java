package com.aptech.aop3;

import java.lang.reflect.Method;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 方法执行前的处理
 * @author jerry
 * @date Mar 12, 2016
 */
public class BeforeAdvice implements MethodBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void before(Method method, Object[] arg, Object target) throws Throwable {
		System.out.println("目标对象：" + target + ", 方法：" + method);
		logger.info("在目标方法开始之前执行的时间：" + new Date());
		
	}

}
