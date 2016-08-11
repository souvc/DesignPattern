package com.souvc.pattern.prototypePattern;

/**
 * 类名: Rectangle.java</br> 
 * 包名：  com.souvc.pattern.prototypePattern </br> 
 * 描述: 建扩展了上面抽象类的实体类。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Rectangle extends Shape {

   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}