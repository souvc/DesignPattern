package com.souvc.pattern.compositePattern;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名: Employee.java</br> 
 * 包名：  com.souvc.pattern.compositePattern </br> 
 * 描述: 创建 Employee 类，该类带有 Employee 对象的列表。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月12日</br>
 */
public class Employee {
   private String name;
   private String dept;
   private int salary;
   private List<Employee> subordinates;

   //构造函数
   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      subordinates = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : "+ name 
      +", dept : "+ dept + ", salary :"
      + salary+" ]");
   }   
}