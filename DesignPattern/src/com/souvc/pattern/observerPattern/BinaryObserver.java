package com.souvc.pattern.observerPattern;

/**
 * 类名: BinaryObserver.java</br>
 * 包名： com.souvc.pattern.observerPattern </br>
 * 描述: 创建实体观察者类。 </br>
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月25日</br>
 */
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}