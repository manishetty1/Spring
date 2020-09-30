package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanScopeApp
{
    public static void main(String[] args)
    {
        //get appligcation context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");

        //get the bean from application context
        Coach coachObj1=context.getBean("myCoach", Coach.class);
        Coach coachObj2=context.getBean("myCoach", Coach.class);

        //invoke methods on the bean
        System.out.println("Memory reference of object1: "+coachObj1);
        System.out.println("Memory reference of object2: "+coachObj2);

        //close application context
        context.close();
    }
}
