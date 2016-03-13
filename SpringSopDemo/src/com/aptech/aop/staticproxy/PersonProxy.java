package com.aptech.aop.staticproxy;

import java.util.Date;

import org.apache.log4j.Logger;

import com.aptech.aop.IPerson;

/**
 * 优点：使用静态代理，把业务代码和日志代码分离， 代理对象和被代理对象实现同一个接口，在代理对象中实现与日志记录相关
 * 的服务，并在需要的时候呼叫被代理对象，而补代理对象只保留业务代码
 * 缺点：一个代理只能服务于一种类型的对象，对于大型项目不能胜任
 * @author jerry
 * @date Mar 12, 2016
 */
public class PersonProxy implements IPerson {
	
	private IPerson person; //被代理对象
	private Logger logger = Logger.getLogger(PersonProxy.class);

	public PersonProxy (IPerson person){
		this.person = person;
	}
	
	@Override
	public void sleep(){
		logger.info("开始执行时间"+new Date());
		person.sleep(); //呼叫被代理对象执行业务 逻辑
		logger.info("结束执行时间"+new Date());
	}

	@Override
	public void eating(){
		logger.info("开始执行时间"+new Date());
		person.eating();
		logger.info("结束执行时间"+new Date());
	}

}
