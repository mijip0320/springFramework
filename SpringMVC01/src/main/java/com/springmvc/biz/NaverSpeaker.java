package com.springmvc.biz;

import org.springframework.stereotype.Component;

@Component("nspeaker")
public class NaverSpeaker implements Speaker {
	public NaverSpeaker() {
		System.out.println("-----------NaverSpeaker ��ü ����--------");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("NAVER SPEAKER ���� �ѱ�");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("NAVER SPEAKER ���� ���̱�");
	}

}
