package com.example.helloworld;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService
{
    @Override
    public String dailyFortune()
    {
        return "It's your lucky day. wohooo!!!";
    }
}
