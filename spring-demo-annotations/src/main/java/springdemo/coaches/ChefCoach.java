package springdemo.coaches;

import org.springframework.stereotype.Component;

@Component
public class ChefCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    // TODO Auto-generated method stub
    return "Cook the house";
  }

  @Override
  public String tellFortune() {
    // TODO Auto-generated method stub
    return null;
  }

}
