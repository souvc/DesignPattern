package com.souvc.pattern.builderPattern;

/**
 * 类名: Item.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述: 产品 的一些特性接口    </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public interface Item {
	
	//名字
	public String name();

	//包装
	public Packing packing();

	//价格
	public float price();
	
}