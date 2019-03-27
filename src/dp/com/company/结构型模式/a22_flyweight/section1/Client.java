package com.company.结构型模式.a22_flyweight.section1;

public class Client {

	public static void main(String[] args) {
		//从工厂中获得一个对象
		SignInfo signInfo = SignInfoFactory.getSignInfo();
		//进行其他业务处理
	}

	
}
