package com.example.helloworld;

public class HappyFortune implements Fortune
{
    @Override
    public String getDailyFortune()
    {
        return "It's your lucky day today";
    }
}
