package com.springmvc.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sam")
public class STV implements TV {
//	SonySpeaker speaker = new SonySpeaker(); //SonySpeaker ��ü ����
	//������ �������Ͽ� <constructor-arg> �ٸ���Ʈ ���� = �Ű����� ����
	@Autowired
	@Resource(name="nspeaker")
	Speaker speaker; //���̹� ����Ŀ ��ü ������
	
	STV(){
		System.out.println("SamsungTv������");
	}
	STV(Speaker speaker){
		System.out.println("SamsungTV ������-����Ŀ ����");
		this.speaker =speaker;
	}
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó���ϱ�");
	}
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ����");
	}

	@Override
	public void powerOn() {
		speaker.volumeUp(); //��ü ȣ���ؼ� �޼��� ���
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
