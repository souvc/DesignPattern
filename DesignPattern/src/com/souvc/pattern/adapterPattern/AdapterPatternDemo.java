package com.souvc.pattern.adapterPattern;

/**
 * 类名: AdapterPatternDemo.java</br>
 * 包名： com.souvc.pattern.adapterPattern </br>
 * 描述: 使用 AudioPlayer 来播放不同类型的音频格式。</br>
 * 发布版本号：V1.0</br>
 * 开发人员：liuhf</br>
 * 创建时间： 2016年8月11日</br>
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
		
	}
}