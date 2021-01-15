package com.springmvc.biz;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")){
			return new STV();
		}else if(beanName.equals("lg")) {
			return new LTV();
		}
		return null;
	}

}
