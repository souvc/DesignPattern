package com.souvc.pattern.adapterPattern;

/**
 * 类名: AdvancedMediaPlayer.java</br> 
 * 包名：  com.souvc.pattern.adapterPattern </br> 
 * 描述: 更高级的媒体播放器</br> 
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public interface AdvancedMediaPlayer {
	
	public void playVlc(String fileName);

	public void playMp4(String fileName);
	
}