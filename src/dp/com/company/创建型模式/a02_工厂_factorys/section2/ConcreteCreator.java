package com.company.创建型模式.a02_工厂_factorys.section2;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteCreator extends Creator {
	
	public <T extends Product> T createProduct(Class<T> c){
		Product product=null;
		try {
			 product = (Product)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			//异常处理
		}		
		return (T)product;		
	}

}
