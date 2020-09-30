package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLifecyleApp
{
    public static void main(String[] args)
    {
        //get appligcation context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");

        //get the bean from application context
        Coach coachObj1=context.getBean("myCoach", Coach.class);

        //invoke methods on the bean
        System.out.println("Memory reference of object1: "+coachObj1);

        //close application context
        context.close();
    }


}
