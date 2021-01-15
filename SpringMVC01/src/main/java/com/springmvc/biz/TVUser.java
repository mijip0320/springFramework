package com.springmvc.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//spring �����̳ʷκ��� �ʿ��� ��ü ��û
		TV tv = (TV) factory.getBean("tv");
		//Ŭ���� �ϳ��� �ϳ��� <bean> ������ �ʿ�, Ŭ������ ������ �������Ͽ� ����Ϸ��� <bean> ������Ʈ ���
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		factory.close();
	}

}
