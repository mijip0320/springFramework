package com.springmvc.biz;

public class STV implements TV {

	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----전원을 켠다");
		
	}


	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----전원을 끈다");
	}

	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----소리를 올린다");
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----소리를 줄인다");
	}
	

}
