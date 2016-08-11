package com.souvc.pattern.builderPattern;

/**
 * 类名: ChickenBurger.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述: 鸡肉汉堡  </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class ChickenBurger extends Burger {

   @Override
   public float price() {
      return 50.5f;
   }

   @Override
   public String name() {
      return "Chicken Burger";
   }
}