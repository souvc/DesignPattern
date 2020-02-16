package com.souvc.pattern.singletonPattern;

/**
 * 类名: Singleton.java</br> 
 * 包名：  com.souvc.pattern.singletonPattern </br> 
 * 描述: 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Singleton_Lazy {
	
	private static Singleton_Lazy instance;

	private Singleton_Lazy() {
	}

	public static Singleton_Lazy getInstance() {
		if (instance == null) {
			instance = new Singleton_Lazy();
		}
		return instance;
	}
}