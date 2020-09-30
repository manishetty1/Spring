package com.example.helloworld;

public class CricketCoach implements Coach
{
    public CricketCoach()
    {
        System.out.println("*************CricketCoach constructor*************");
    }
    public void initializeBean()
    {
        System.out.println("**************initialize Bean****************");
    }

    @Override
    public String getDailyWorkOut()
    {
        return "Run 25k";
    }

    public void destroyBean()
    {
        System.out.println("**************destroy Bean****************");
    }
}
