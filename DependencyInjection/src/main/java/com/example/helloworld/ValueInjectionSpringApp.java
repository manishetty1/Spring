package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ValueInjectionSpringApp
{
    public static void main(String[] args)
    {
        //get application context
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("valueInjection.xml"))
        {
            CricketCoach coach =context.getBean("CricketCoachBean", CricketCoach.class);
            System.out.println(coach.emailAddress);
            System.out.println(coach.getTeamName());

           /* Coach coach =context.getBean("BasketCoachBean", Coach.class);
            System.out.println(coach.getDailyFortune());*/
        }
    }
}
