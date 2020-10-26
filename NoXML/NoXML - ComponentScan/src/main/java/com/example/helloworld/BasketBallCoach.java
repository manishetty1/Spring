package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach
{
    @Autowired
    public FortuneService fortuneService;

    BasketBallCoach()
    {

    }

    @Override
    public String getDailyWorkOut()
    {
        return "Run 5k";
    }

    public String getFortune()
    {
        return fortuneService.dailyFortune();
    }

}
