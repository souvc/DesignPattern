package com.souvc.pattern.filterPattern;

/**
 * 类名: Person.java</br> 
 * 包名：  com.souvc.pattern.filterPattern </br> 
 * 描述: 创建一个类，在该类上应用标准。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月12日</br>
 */
public class Person {
	
   private String name;
   private String gender;
   private String maritalStatus;

   public Person(String name,String gender,String maritalStatus){
      this.name = name;
      this.gender = gender;
      this.maritalStatus = maritalStatus;		
   }

   public String getName() {
      return name;
   }
   public String getGender() {
      return gender;
   }
   public String getMaritalStatus() {
      return maritalStatus;
   }	
}