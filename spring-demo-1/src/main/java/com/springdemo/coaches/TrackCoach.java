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
  
  // add an init method
  public void doMyStartupStuff() {
    System.out.println("TrackCoach: inside method doMyStartupStuff");
  }
  
  // add a destroy method
  public void doMyCleanupStuff() {
    System.out.println("TrackCoach: inside method doMyCleanupStuff");
  }
}
