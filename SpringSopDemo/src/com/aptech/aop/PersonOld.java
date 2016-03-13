package com.aptech.aop;

import java.util.Date;

import org.apache.log4j.Logger;

/**
 * 传统的日志记录信息，跟踪程序的运行过程
 * @author jerry
 * @date Mar 12, 2016
 */
public class PersonOld {
	
	private Logger logger = Logger.getLogger(PersonOld.class);
	
	public void sleep(){
		logger.info("开始执行时间"+new Date());
		System.out.println("睡觉中");
		logger.info("结束执行时间"+new Date());
	}

	public void eating(){
		logger.info("开始执行时间"+new Date());
		System.out.println("正在吃饭中");
		logger.info("结束执行时间"+new Date());
	}
	
	public static void main(String[] args) {
		PersonOld p = new PersonOld();
		p.sleep();
		p.eating();
	}
}
