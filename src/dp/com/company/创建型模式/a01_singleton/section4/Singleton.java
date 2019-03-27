package com.company.创建型模式.a01_singleton.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public final class Singleton {
	private static Singleton singleton = null;
	
	//限制产生多个对象
	private Singleton(){  }

	/**
	 * @description 懒汉式,线程不安全
	 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
	 * 因为没有加锁 synchronized，
	 * 所以严格意义上它并不算单例模式。
	 *	这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
	 * @author liukx
	 * @date 2019/3/27
	 */
	public static Singleton getSingleton1(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}

	/**
	 * @description 懒汉式，线程安全
	 * 这种方式具备很好的 lazy loading，
	 * 能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
		优点：第一次调用才初始化，避免内存浪费。
		缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
	 * @author liukx
	 * @date 2019/3/27
	 */
	//通过该方法获得实例对象
	public synchronized static Singleton getSingleton2(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;		
	}
}
