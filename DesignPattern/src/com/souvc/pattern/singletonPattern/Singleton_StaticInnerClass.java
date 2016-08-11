package com.souvc.pattern.singletonPattern;

/**
 * 类名: Singleton.java</br> 
 * 包名：  com.souvc.pattern.singletonPattern </br> 
 * 描述: 登记式/静态内部类</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Singleton_StaticInnerClass {
	
	private static class SingletonHolder {
		private static final Singleton_StaticInnerClass INSTANCE = new Singleton_StaticInnerClass();
	}

	private Singleton_StaticInnerClass() {
	}

	public static final Singleton_StaticInnerClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}