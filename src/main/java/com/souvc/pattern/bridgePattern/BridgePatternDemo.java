package com.souvc.pattern.bridgePattern;

/**
 * 类名: BridgePatternDemo.java</br> 
 * 包名：  com.souvc.pattern.bridgePattern </br> 
 * 描述: 使用 Shape 和 DrawAPI 类画出不同颜色的圆。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}