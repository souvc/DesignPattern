package com.souvc.pattern.factoryPattern;

/**
 * 类名: FactoryPatternDemo.java</br> 
 * 包名：  com.souvc.pattern.factoryPattern </br> 
 * 描述: 使用该工厂，通过传递类型信息来获取实体类的对象。 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class FactoryPatternDemo {

   public static void main(String[] args) {
      
	  ShapeFactory shapeFactory = new ShapeFactory();

      //获取 Circle 的对象，并调用它的 draw 方法
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //调用 Circle 的 draw 方法
      shape1.draw();

      //获取 Rectangle 的对象，并调用它的 draw 方法
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //调用 Rectangle 的 draw 方法
      shape2.draw();

      //获取 Square 的对象，并调用它的 draw 方法
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //调用 Square 的 draw 方法
      shape3.draw();
   }
}