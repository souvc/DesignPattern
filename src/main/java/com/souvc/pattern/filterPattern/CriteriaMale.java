package com.souvc.pattern.filterPattern;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名: CriteriaMale.java</br> 
 * 包名：  com.souvc.pattern.filterPattern </br> 
 * 描述: 创建实现了 Criteria 接口的实体类。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月12日</br>
 */
public class CriteriaMale implements Criteria {

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> malePersons = new ArrayList<Person>(); 
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("MALE")){
            malePersons.add(person);
         }
      }
      return malePersons;
   }
}