package com.springmvc.biz;

import org.springframework.stereotype.Component;

@Component("nspeaker")
public class NaverSpeaker implements Speaker {
	public NaverSpeaker() {
		System.out.println("-----------NaverSpeaker °´Ã¼ »ý¼º--------");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("NAVER SPEAKER º¼·ý ÄÑ±â");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("NAVER SPEAKER º¼·ý ÁÙÀÌ±â");
	}

}
