package com.example.helloworld;

public class BasketBallCoach implements Coach
{

    Fortune fortune;

    public BasketBallCoach()
    {
        System.out.println("BasketBallCoach: Constructor");
    }

    public void setFortune(Fortune fortune)
    {
        System.out.println("Inside setfortune method");
        this.fortune = fortune;
    }

    public Fortune getFortune() {
        return fortune;
    }


    @Override
    public String getDailyWorkOut()
    {
        return "Run 5k";
    }

    public String getDailyFortune()
    {
        return this.fortune.getDailyFortune();
    }
}
