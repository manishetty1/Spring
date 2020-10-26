package com.example.helloworld;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneServiceImpl implements FortuneService
{
    @Override
    public String dailyFortune()
    {
        return "It's your lucky day. cool!!!";
    }
}
