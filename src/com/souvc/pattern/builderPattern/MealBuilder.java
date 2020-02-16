package com.souvc.pattern.builderPattern;

/**
 * 类名: MealBuilder.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述: 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}