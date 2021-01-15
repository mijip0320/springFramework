package com.springmvc.biz;

public class STV implements TV {
	SonySpeaker speaker = new SonySpeaker(); //SonySpeaker 객체 생성
	STV(){
		System.out.println("SamsungTv생성자");
	}
	STV(SonySpeaker speaker){
		System.out.println("SamsungTV 생성자-스피커 포함");
		this.speaker =speaker;
	}
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리하기");
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직");
	}

	@Override
	public void powerOn() {
		speaker.volumeUp(); //객체 호출해서 메서드 사용
		System.out.println("SamsungTv----전원을 켠다");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----전원을 끈다");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----소리를 올린다");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----소리를 줄인다");
	}
	

}
