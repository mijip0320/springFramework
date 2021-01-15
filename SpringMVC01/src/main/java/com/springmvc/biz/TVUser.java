package com.springmvc.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//spring 컨테이너로부터 필요한 객체 요청
//		TV tv = (TV) factory.getBean("tv");
		//클래스 하나당 하나의 <bean> 설정이 필요, 클래스를 스프링 설정파일에 등록하려면 <bean> 엘리먼트 사용
		
		TV tv = (TV) factory.getBean("tv");
//		TV tv2 = (TV) factory.getBean("tv");
//		TV tv3 = (TV) factory.getBean("tv");
		
		System.out.println("TV: "+tv);
//		System.out.println("TV2: "+tv2);
//		System.out.println("TV3: "+tv3);
		//Spring에서의 Scope의 디폴트값은 singleton이기 때문에 객체를 여러번 불러와도 하나의 주소로 하나의 객체로 사용된다. 객체는 메모리에 하나만 생성되어 유지된다.
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		factory.close();
	}

}
