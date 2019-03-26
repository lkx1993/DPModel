package com.company.结构型模式.a13_适配器_adapter.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 适配器
 */
public class Adapter extends Adaptee implements Target {
	
	public void request() {
		super.doSomething();
	}

}
