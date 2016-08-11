package com.souvc.pattern.singletonPattern;

/**
 * 类名: SingleObject.java</br> 
 * 包名：  com.souvc.pattern.singletonPattern </br> 
 * 描述: 创建一个 Singleton 类。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class SingleObject {

	// 创建 SingleObject 的一个对象
	private static SingleObject instance = new SingleObject();

	// 让构造函数为 private，这样该类就不会被实例化
	private SingleObject() {
	}

	// 获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}