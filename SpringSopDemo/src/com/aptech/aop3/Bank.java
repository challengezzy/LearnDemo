package com.aptech.aop3;

public class Bank implements IBank {

	@Override
	public void setMoney(int howmany) {
		System.out.println("存了" + howmany);
		
	}

	@Override
	public int getMoney(int howmany) {
		System.out.println("取了" + howmany);
		return howmany;
	}

}
