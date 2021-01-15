package com.springmvc.biz;

public class STV implements TV {
	
	STV(){
		System.out.println("SamsungTv생성자");
	}
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리하기");
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
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
