package com.springdemo.coaches;

import com.springdemo.fortunes.FortuneService;

public class TrackCoach implements Coach {

  private FortuneService fortuneService;
  
  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    // TODO Auto-generated method stub
    return "Run a hard 5k";
  }

  @Override
  public String tellFortune() {
    // TODO Auto-generated method stub
    return "Just do It: " + fortuneService.tellFortune();
  }

}
