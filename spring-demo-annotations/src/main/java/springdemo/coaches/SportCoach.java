package springdemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import springdemo.fortunes.FortuneService;

@Component
public class SportCoach implements Coach {

  @Autowired
  @Qualifier("randomFortuneService")
  private FortuneService fortuneService;
  
  @Autowired
  @Value("${foo.email}")
  private String email;
  
  @Autowired
  @Value("${foo.team}")
  private String team;
  
  @Override
  public String getDailyWorkout() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String tellFortune() {
    // TODO Auto-generated method stub
    return null;
  }
  
  public String tellMeEverything() {
    return fortuneService.getFortune() + "\n"
        + team + "\n"
        + email;
  }

}
