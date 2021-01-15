package com.springmvc.biz;

public class LTV implements TV {
	Speaker speaker;
	Price price;
	LTV(){
		System.out.println("LGTv생성자");
	}
	
	LTV(Speaker speaker, Price price){
		this.speaker=speaker;
		this.price=price;
		System.out.println("speaker객체와 price객체 받아오기 완료~!");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----전원을 켠다");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----전원을 켠다");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----전원을 켠다");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----전원을 켠다");
	}

}
