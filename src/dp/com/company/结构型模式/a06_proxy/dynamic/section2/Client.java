package com.company.结构型模式.a06_proxy.dynamic.section2;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//https://blog.csdn.net/lovejj1994/article/details/78080124
		//生成代理类文件,路径是项目根路径下的com.sun.proxy
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

		//定义一个主题
		Subject subject = new RealSubject();
		//定义主题的代理
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		//代理的行为
		proxy.doSomething("Finish");
	}
}
