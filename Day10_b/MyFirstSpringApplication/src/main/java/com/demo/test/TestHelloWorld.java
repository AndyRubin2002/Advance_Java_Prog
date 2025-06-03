package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.HelloWorld;
import com.demo.model.Product;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		HelloWorld hwbean=(HelloWorld)ctx.getBean("hw");
		hwbean.sayHello();
		Product prod1=(Product)ctx.getBean("p1");
		System.out.println(prod1);

	}

}
