package com.souvc.pattern.observerPattern;

/**
 * 类名: Observer.java</br>
 * 包名： com.souvc.pattern.observerPattern </br>
 * 描述: 观察者 </br>
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月25日</br>
 */
public abstract class Observer {
	
	protected Subject subject;

	public abstract void update();
}