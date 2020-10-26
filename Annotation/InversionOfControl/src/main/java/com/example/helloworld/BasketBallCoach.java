package com.example.helloworld;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach
{
    @Override
    public String getDailyWorkOut()
    {
        return "Run 5k";
    }
}
