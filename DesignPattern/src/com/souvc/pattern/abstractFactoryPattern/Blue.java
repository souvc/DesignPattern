package com.souvc.pattern.abstractFactoryPattern;

/**
 * 类名: Blue.java</br> 
 * 包名：  com.souvc.pattern.abstractFactoryPattern </br> 
 * 描述: 创建实现接口的实体类。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Blue implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}