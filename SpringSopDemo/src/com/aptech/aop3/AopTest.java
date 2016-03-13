package com.aptech.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring Aop的配置测试
 * @author jerry
 * @date Mar 12, 2016
 */
public class AopTest {

	public static void main(String[] args) {
		ApplicationContext ac =
				new FileSystemXmlApplicationContext(new String[]{"src/applicationContext.xml"});
		
		IBank bank = (IBank)ac.getBean("beforeProxy"); //获得代理工厂的bean
		bank.setMoney(5);
		bank.getMoney(2);
		
		IBank bank2 = (IBank)ac.getBean("bankService"); //获得代理工厂的bean
		bank2.setMoney(16);
		bank2.getMoney(23);
		
	}
}
