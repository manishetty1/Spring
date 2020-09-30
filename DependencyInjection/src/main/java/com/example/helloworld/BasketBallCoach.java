package com.example.helloworld;

public class BasketBallCoach
{
    HappyFortune fortune;

    public BasketBallCoach()
    {
        System.out.println("BasketBall constructor");
    }

    public void setFortune(HappyFortune fortune)
    {
        System.out.println("BasketBallCoach: setfortune method");
        this.fortune = fortune;
    }

}
