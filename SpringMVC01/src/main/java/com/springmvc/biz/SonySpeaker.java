package com.springmvc.biz;

public class SonySpeaker implements Speaker {
	public SonySpeaker(){
		System.out.println("==>소니객체 생성");
	}
	public void volumeUp() {
		System.out.println("소니Speaker 볼륨 올린다.");
	}
	public void volumeDown() {
		System.out.println("소니Speaker 볼륨 내린다.");
	}

}
