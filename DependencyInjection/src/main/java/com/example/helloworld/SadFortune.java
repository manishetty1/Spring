package com.example.helloworld;

public class SadFortune implements Fortune
{
    @Override
    public String getDailyFortune()
    {
        return "Its your unlucky day today!!!";
    }
}
