package com.example.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
  Program to demonstrate inversion of control using annotations
*/

public class HelloSpringApp
{
    public static void main(String[] args)
    {
        //get appligcation context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.SpringConfiguration.class);

        //get the bean from application context
        BasketBallCoach coachObj=context.getBean("basketBallCoach", BasketBallCoach.class);

        //invoke get email on basketballcoach
        System.out.println(coachObj.email);

        //invoke get teamname on basketballcoach
        System.out.println(coachObj.teamName);

        //close application context
        context.close();
    }
}
