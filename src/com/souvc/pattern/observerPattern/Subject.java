package com.souvc.pattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名: Subject.java</br>
 * 包名： com.souvc.pattern.observerPattern </br>
 * 描述: 创建 Subject 类 </br>
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月25日</br>
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}