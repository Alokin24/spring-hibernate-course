package springdemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springdemo.fortunes.FortuneService;

@Component
public class TennisCoach implements Coach {

  private FortuneService fortuneService;
   
  public TennisCoach() {
    // TODO Auto-generated constructor stub
  }
  
//  @Autowired 
//  public void setFortuneService(FortuneService fortuneService) {
//    System.out.println(">> TennisCoach: inside setFortuneService");
//    this.fortuneService = fortuneService;
//  }
  
  @Autowired
  @Qualifier("randomFortuneService")
  public void doSomeStuff(FortuneService fortuneService) {
    System.out.println(">> TennisCoach: Inside doSomeStuff"); 
    this.fortuneService = fortuneService;
  }
  
  @Override
  public String getDailyWorkout() {
    
    return "Practice your backhand volley";
  }

  @Override
  public String tellFortune() {
    // TODO Auto-generated method stub
    return fortuneService.getFortune();
  }

}
