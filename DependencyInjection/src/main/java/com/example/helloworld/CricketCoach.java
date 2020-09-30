package com.example.helloworld;

public class CricketCoach implements Coach
{
    Fortune fortune;

    public Fortune getFortune()
    {
        return fortune;
    }

    public void setFortune(Fortune fortune)
    {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut()
    {
        return null;
    }

    @Override
    public String getDailyFortune()
    {
        return this.fortune.getDailyFortune();
    }
}
