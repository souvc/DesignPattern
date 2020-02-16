package com.souvc.pattern.singletonPattern;

/**
 * 类名: SingletonPatternDemo.java</br>
 * 包名： com.souvc.pattern.singletonPattern </br>
 * 描述:从 singleton 类获取唯一的对象。</br>
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class SingletonPatternDemo {
	
	public static void main(String[] args) {

		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();

		// 显示消息
		object.showMessage();
	}
}