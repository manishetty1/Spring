package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach
{
    public FortuneService fortuneService;

    @Autowired
    public BasketBallCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
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
