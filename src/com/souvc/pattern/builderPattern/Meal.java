package com.souvc.pattern.builderPattern;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名: Meal.java</br> 
 * 包名：  com.souvc.pattern.builderPattern </br> 
 * 描述:  用餐   </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Meal {
   
   private List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

   public float getCost(){
      float cost = 0.0f;
      for (Item item : items) {
         cost += item.price();
      }		
      return cost;
   }

   public void showItems(){
      for (Item item : items) {
         System.out.print("Item : "+item.name());
         System.out.print(", Packing : "+item.packing().pack());
         System.out.println(", Price : "+item.price());
      }		
   }	
}