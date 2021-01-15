package com.springmvc.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sam")
public class STV implements TV {
//	SonySpeaker speaker = new SonySpeaker(); //SonySpeaker 객체 생성
	//스프링 설정파일에 <constructor-arg> 앨리먼트 개수 = 매개변수 개수
	@Autowired
	@Resource(name="nspeaker")
	Speaker speaker; //네이버 스피커 객체 생성됨
	
	STV(){
		System.out.println("SamsungTv생성자");
	}
	STV(Speaker speaker){
		System.out.println("SamsungTV 생성자-스피커 포함");
		this.speaker =speaker;
	}
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리하기");
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직");
	}

	@Override
	public void powerOn() {
		speaker.volumeUp(); //객체 호출해서 메서드 사용
		System.out.println("SamsungTv----전원을 켠다");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----전원을 끈다");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----소리를 올린다");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv----소리를 줄인다");
	}
	

}
