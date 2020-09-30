package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
	public static void main(String[] args)
	{
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			Triangle triangle = (Triangle) context.getBean("triangle");
			triangle.draw();
		}
	}
}
