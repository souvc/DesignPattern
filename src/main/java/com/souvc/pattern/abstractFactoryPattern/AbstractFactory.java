package com.souvc.pattern.abstractFactoryPattern;

/**
 * 类名: AbstractFactory.java</br>
 * 包名： com.souvc.pattern.abstractFactoryPattern </br>
 * 描述: 为 Color 和 Shape 对象创建抽象类来获取工厂。</br>
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public abstract class AbstractFactory {
	
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}