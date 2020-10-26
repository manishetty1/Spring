package com.example.helloworld;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceImpl implements FortuneService
{
    @Override
    public String dailyFortune()
    {
        return "It's your random fortune day. wohooo!!!";
    }
}
