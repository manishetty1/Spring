package com.example.helloworld;

public class BadFortune implements Fortune
{
    @Override
    public String getDailyFortune()
    {
        return "It's your unlucky day today";
    }
}
