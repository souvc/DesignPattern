package com.souvc.pattern.decoratorPattern;

/**
 * 类名: Rectangle.java</br> 
 * 包名：  com.souvc.pattern.decoratorPattern </br> 
 * 描述: 矩形  </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月12日</br>
 */
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}