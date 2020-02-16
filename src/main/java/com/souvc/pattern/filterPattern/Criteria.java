package com.souvc.pattern.filterPattern;
import java.util.List;

/**
 * 类名: Criteria.java</br> 
 * 包名：  com.souvc.pattern.filterPattern </br> 
 * 描述: 为标准（Criteria）创建一个接口。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月12日</br>
 */
public interface Criteria {
	
   public List<Person> meetCriteria(List<Person> persons);
   
}