package com.mahesh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {

		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"file:spring.xml");	
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		circle Circle = (circle) context.getBean("circle");
		Circle.draw();
		
		circle Circle = (circle) context.getBean("circle");
		Circle.draw();
	
		
	}

}
