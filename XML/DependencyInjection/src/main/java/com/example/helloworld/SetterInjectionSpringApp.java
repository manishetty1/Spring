package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterInjectionSpringApp
{
    public static void main(String[] args)
    {
        //get application context
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setterInjection.xml"))
        {
            Coach coach =context.getBean("CricketCoachBean", Coach.class);
            System.out.println(coach.getDailyFortune());

           /* Coach coach =context.getBean("BasketCoachBean", Coach.class);
            System.out.println(coach.getDailyFortune());*/
        }
    }
}
