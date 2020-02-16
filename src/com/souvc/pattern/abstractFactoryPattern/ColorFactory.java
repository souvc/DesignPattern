package com.souvc.pattern.abstractFactoryPattern;

/**
 * 类名: ColorFactory.java</br> 
 * 包名：  com.souvc.pattern.abstractFactoryPattern </br> 
 * 描述: 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}