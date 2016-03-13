package com.aptech.aop3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

/**
 * 在方法执行前后均介入
 * @author jerry
 * @date Mar 12, 2016
 */
public class AroundAdvice implements MethodInterceptor {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		logger.info("目标方法执行前的动作xxx");
		
		//调用业务方法
		Object result = methodInvocation.proceed();
		
		logger.info("目标方法执行后的动作!!!");
		
		return result;
	}

}
