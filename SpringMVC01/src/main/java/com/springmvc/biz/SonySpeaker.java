package com.springmvc.biz;

public class SonySpeaker implements Speaker {
	public SonySpeaker(){
		System.out.println("==>�Ҵϰ�ü ����");
	}
	public void volumeUp() {
		System.out.println("�Ҵ�Speaker ���� �ø���.");
	}
	public void volumeDown() {
		System.out.println("�Ҵ�Speaker ���� ������.");
	}

}
