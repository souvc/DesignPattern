package com.souvc.pattern.bridgePattern;

/**
 * 类名: RedCircle.java</br> 
 * 包名：  com.souvc.pattern.bridgePattern </br> 
 * 描述: 创建实现了 DrawAPI 接口的实体桥接实现类。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class RedCircle implements DrawAPI {
	
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}