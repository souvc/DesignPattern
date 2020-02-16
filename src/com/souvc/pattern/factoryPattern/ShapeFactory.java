package com.souvc.pattern.factoryPattern;

/**
 * 类名: ShapeFactory.java</br> 
 * 包名：  com.souvc.pattern.factoryPattern </br> 
 * 描述: 创建一个工厂，生成基于给定信息的实体类的对象。 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class ShapeFactory {
	
   //使用 getShape 方法获取形状类型的对象
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
}