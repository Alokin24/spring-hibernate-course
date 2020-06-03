package springdemo.fortunes;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

  private String[] data = {
      "beware",
      "dilligent",
      "dead"
  };
  
  private Random myRandom = new Random();
  
  @Override
  public String getFortune() {
    // TODO Auto-generated method stub
 
    int index = myRandom.nextInt(data.length);
    
    return data[index];
  }

}
