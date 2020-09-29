package com.example.helloworld;

public class CricketCoach implements Coach
{
    Fortune fortune;

    public  CricketCoach(Fortune fortune)
    {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut()
    {
        return "Run 25k";
    }

    @Override
    public String getDailyFortune()
    {
        return fortune.getDailyFortune();
    }
}
