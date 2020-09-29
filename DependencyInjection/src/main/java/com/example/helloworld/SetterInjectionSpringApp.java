package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterInjectionSpringApp
{
    public static void main(String[] args)
    {
        //get application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from application context
        Coach coachObj=context.getBean("myBasketBallCoach", Coach.class);

        //invoke methods on the bean
        //System.out.println(coachObj.getDailyFortune());

        //close application context
        context.close();
    }
}
