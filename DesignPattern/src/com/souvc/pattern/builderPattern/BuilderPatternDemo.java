package com.souvc.pattern.builderPattern;

/**
 * 类名: BuilderPatternDemo.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述: BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）。 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class BuilderPatternDemo {
   public static void main(String[] args) {
      
	  MealBuilder mealBuilder = new MealBuilder();

      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " +vegMeal.getCost());

      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " +nonVegMeal.getCost());
   }
}