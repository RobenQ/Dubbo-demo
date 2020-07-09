package com.consumer.start;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.consumer.serviceimpl.SayImpl;
import com.dubbo.service.Say;

public class consumerStart {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SayImpl consumer = (SayImpl) context.getBean("a",SayImpl.class);
		System.out.println(consumer.sayName("周庆"));
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
