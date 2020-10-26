package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach
{
    public FortuneService fortuneService;

    @Value("${team.email}")
    String email;

    @Value("${team.teamname}")
    String teamName;


    BasketBallCoach()
    {

    }

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

    public String getEmail()
    {
        return email;
    }

    public String getTeamName()
    {
        return teamName;
    }

}
