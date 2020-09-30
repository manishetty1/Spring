package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterInjectionSpringApp
{
    public static void main(String[] args)
    {
        //get application context
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters7/spring.xml"))
        {

        }

        //get the bean from application context
       // context.getBean("basketBallCoachBean");

        //invoke methods on the bean
        //System.out.println(coachObj.getDailyFortune());

        //close application context
        //context.close();
    }
}
