package com.springmvc.biz;

public class STV implements TV {
	
	STV(){
		System.out.println("SamsungTv������");
	}
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó���ϱ�");
	}
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ����");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----������ �Ҵ�");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----������ ����");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----�Ҹ��� �ø���");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----�Ҹ��� ���δ�");
	}
	

}
