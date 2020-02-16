package com.souvc.pattern.abstractFactoryPattern;

/**
 * 类名: FactoryProducer.java</br>
 * 包名： com.souvc.pattern.abstractFactoryPattern </br>
 * 描述: 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。</br>
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}