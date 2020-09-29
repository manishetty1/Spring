package com.example.helloworld;

public class HappyFortune implements Fortune
{
    public HappyFortune()
    {
        System.out.println("Happy fortune created");
    }
    @Override
    public String getDailyFortune()
    {
        return "Its your lucky day today!!!";
    }
}
