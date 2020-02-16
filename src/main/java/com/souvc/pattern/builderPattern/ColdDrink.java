package com.souvc.pattern.builderPattern;

/**
 * 类名: ColdDrink.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述: 点冷饮 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}