package com.springmvc.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("majustoryContext.xml");
		//spring �����̳ʷκ��� �ʿ��� ��ü ��û
//		TV tv = (TV) factory.getBean("tv");
		//Ŭ���� �ϳ��� �ϳ��� <bean> ������ �ʿ�, Ŭ������ ������ �������Ͽ� ����Ϸ��� <bean> ������Ʈ ���
		
		TV tv = (TV) factory.getBean("sam"); //@Component("sam")�� ���� ������ ã��
//		TV tv2 = (TV) factory.getBean("tv");
//		TV tv3 = (TV) factory.getBean("tv");
		
		System.out.println("TV: "+tv);
//		System.out.println("TV2: "+tv2);
//		System.out.println("TV3: "+tv3);
		//Spring������ Scope�� ����Ʈ���� singleton�̱� ������ ��ü�� ������ �ҷ��͵� �ϳ��� �ּҷ� �ϳ��� ��ü�� ���ȴ�. ��ü�� �޸𸮿� �ϳ��� �����Ǿ� �����ȴ�.
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		factory.close();
	}

}
