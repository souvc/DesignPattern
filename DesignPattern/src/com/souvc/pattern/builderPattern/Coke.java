package com.souvc.pattern.builderPattern;

/**
 * 类名: Coke.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述: 焦炭饮料    </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Coke extends ColdDrink {

   @Override
   public float price() {
      return 30.0f;
   }

   @Override
   public String name() {
      return "Coke";
   }
   
}