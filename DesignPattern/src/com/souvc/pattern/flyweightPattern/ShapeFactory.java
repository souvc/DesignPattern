package com.souvc.pattern.flyweightPattern;

import java.util.HashMap;
/**
 * 类名: ShapeFactory.java</br> 
 * 包名：  com.souvc.pattern.flyweightPattern </br> 
 * 描述: 创建一个工厂，生成基于给定信息的实体类的对象。。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月15日</br>
 */
public class ShapeFactory {
	
	private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

	public static Shape getCircle(String color) {
		
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}