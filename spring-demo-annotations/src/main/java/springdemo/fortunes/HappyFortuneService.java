package springdemo.fortunes;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    
    return "Good fortune to you";
  }

}
