package com.project.wallet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springconfigFile="applicationContext.xml";
		
		ApplicationContext springcontainer=new ClassPathXmlApplicationContext(springconfigFile);
		Wallet wallet=springcontainer.getBean(Wallet.class);
		System.out.println(wallet);
	}
	

}
