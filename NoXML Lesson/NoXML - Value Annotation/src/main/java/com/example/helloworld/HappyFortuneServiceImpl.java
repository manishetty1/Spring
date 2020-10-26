package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceImpl implements FortuneService
{

    @Override
    public String dailyFortune()
    {
        return "It's your lucky day. cool!!!";
    }


}
