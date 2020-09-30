package com.example.helloworld;

public class CricketCoach implements Coach
{
    Fortune fortune;
    String teamName;
    String emailAddress;

    public Fortune getFortune()
    {
        return fortune;
    }

    public void setFortune(Fortune fortune)
    {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut()
    {
        return null;
    }

    @Override
    public String getDailyFortune()
    {
        return this.fortune.getDailyFortune();
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }


}
