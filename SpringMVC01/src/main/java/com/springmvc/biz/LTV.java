package com.springmvc.biz;

public class LTV implements TV {
	Speaker speaker;
	Price price;
	LTV(){
		System.out.println("LGTv������");
	}
	
	LTV(Speaker speaker, Price price){
		this.speaker=speaker;
		this.price=price;
		System.out.println("speaker��ü�� price��ü �޾ƿ��� �Ϸ�~!");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----������ �Ҵ�");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----������ �Ҵ�");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----������ �Ҵ�");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LGTv----������ �Ҵ�");
	}

}
