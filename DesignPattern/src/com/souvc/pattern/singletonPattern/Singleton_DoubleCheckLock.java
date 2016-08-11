package com.souvc.pattern.singletonPattern;

/**
 * 类名: Singleton_DoubleCheckLock.java</br> 
 * 包名：  com.souvc.pattern.singletonPattern </br> 
 * 描述: 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class Singleton_DoubleCheckLock {

	private volatile static Singleton_DoubleCheckLock singleton;

	private Singleton_DoubleCheckLock() {
	}

	public static Singleton_DoubleCheckLock getSingleton() {
		if (singleton == null) {
			synchronized (Singleton_DoubleCheckLock.class) {
				if (singleton == null) {
					singleton = new Singleton_DoubleCheckLock();
				}
			}
		}
		return singleton;
	}
}
