package com.springmvc.biz;

public class KakaoSpeaker implements Speaker {

	public KakaoSpeaker() {
		System.out.println("===>카카오객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("===>카카오speaker 볼륨 올린다");
		
	}

	
	public void volumeDown() {
		System.out.println("===>카카오speaker 볼륨 내린다");
		
	}

}
