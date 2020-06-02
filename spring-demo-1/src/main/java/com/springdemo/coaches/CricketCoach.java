package com.springdemo.coaches;

import com.springdemo.fortunes.FortuneService;

public class CricketCoach implements Coach {
  
  private String emailAdress;
  private String team;
  private FortuneService fortuneService;
   
  
  public String getEmailAdress() {
    return emailAdress;
  }

  
  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }

  
  public String getTeam() {
    return team;
  }

  
  public void setTeam(String team) {
    this.team = team;
  }

  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }
  
  @Override
  public String getDailyWorkout() {
    // TODO Auto-generated method stub
    return "Crick";
  }

  @Override
  public String tellFortune() {
    // TODO Auto-generated method stub
    return fortuneService.tellFortune();
  }

}
