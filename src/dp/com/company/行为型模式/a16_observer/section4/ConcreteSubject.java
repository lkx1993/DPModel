package com.company.行为型模式.a16_observer.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteSubject extends Subject {
	
	//具体的业务
	public void doSomething(){
		/*
		 * do something
		 */
		super.notifyObserver();
	}
}
