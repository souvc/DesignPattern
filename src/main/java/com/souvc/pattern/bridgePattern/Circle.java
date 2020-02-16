package com.souvc.pattern.bridgePattern;

/**
 * 类名: Circle.java</br> 
 * 包名：  com.souvc.pattern.bridgePattern </br> 
 * 描述: 画圆 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Circle extends Shape {
	
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}