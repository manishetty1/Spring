package com.example.helloworld;

public class BasketBallCoach implements Coach
{
    Fortune fortune;

    public BasketBallCoach()
    {
        System.out.println("BasketBall constructor");
    }

    public void setFortune(Fortune fortune)
    {
        System.out.println("BasketBallCoach: setfortune method");
        this.fortune = fortune;
    }

    @Override
    public String getDailyFortune()
    {
        return this.fortune.getDailyFortune();
    }

    @Override
    public String getDailyWorkOut()
    {
        return null;
    }


}
