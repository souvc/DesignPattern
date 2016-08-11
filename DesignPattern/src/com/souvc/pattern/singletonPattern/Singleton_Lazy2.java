package com.souvc.pattern.singletonPattern;

/**
 * 类名: Singleton_Lazy2.java</br> 
 * 包名：  com.souvc.pattern.singletonPattern </br> 
 * 描述: 懒汉式，线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。 </br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Singleton_Lazy2 {  
    
	private static Singleton_Lazy2 instance;  
   
    private Singleton_Lazy2 (){}  
   
    public static synchronized Singleton_Lazy2 getInstance() {  
    if (instance == null) {  
        instance = new Singleton_Lazy2();  
    }  
    return instance;  
    }  
} 