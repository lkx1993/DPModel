package com.company.结构型模式.a06_proxy.dynamic.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RealSubject implements Subject {

	//业务操作
	public void doSomething(String str) {
		System.out.println("do something!---->" + str);
	}

}
