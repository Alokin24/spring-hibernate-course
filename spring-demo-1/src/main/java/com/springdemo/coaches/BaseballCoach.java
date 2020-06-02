package com.springdemo.coaches;

import com.springdemo.fortunes.FortuneService;

public class BaseballCoach implements Coach {
  
  private FortuneService fortuneService;
  
  
  public BaseballCoach(FortuneService fortuneService) {
    // TODO Auto-generated constructor stub
    this.fortuneService = fortuneService;
  }
  
  public String tellFortune() {
    return fortuneService.tellFortune();
  }
  
  public String getDailyWorkout() {
    return "Spend 30 minutes on batting practice";
  }
}



