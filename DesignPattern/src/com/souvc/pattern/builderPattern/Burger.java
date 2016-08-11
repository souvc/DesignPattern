package com.souvc.pattern.builderPattern;

/**
 * 类名: Burger.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述: 汉堡  </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public abstract class Burger implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}