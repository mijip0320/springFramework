package com.springmvc.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//spring 컨테이너로부터 필요한 객체 요청
		TV tv = (TV) factory.getBean("tv");
		//클래스 하나당 하나의 <bean> 설정이 필요, 클래스를 스프링 설정파일에 등록하려면 <bean> 엘리먼트 사용
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		factory.close();
	}

}
