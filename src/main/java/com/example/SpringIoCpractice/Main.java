//TODO
package com.example.SpringIoCpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
    public static void main(String[] args) {
		
	  ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"hello.xml"});
        HelloWorld HelloWorld = (HelloWorld) context.getBean("helloWorld");
        HelloWorld.getHello();
        }
}