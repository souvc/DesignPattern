package com.souvc.pattern.adapterPattern;

/**
 * 类名: VlcPlayer.java</br> 
 * 包名：  com.souvc.pattern.adapterPattern </br> 
 * 描述: 实现了 AdvancedMediaPlayer 接口的实体类。</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}
}