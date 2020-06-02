package com.springdemo.fortunes;

import java.util.ArrayList;
import java.util.List;

public class RandomFortuneService implements FortuneService {

  private List<String> fortunes;
  
  public RandomFortuneService() {
    fortunes = new ArrayList<>();
  
    fortunes.add("Good");
    fortunes.add("Bad");
    fortunes.add("Dead");
    
  }

  private int generateRandomFortuneIndex() {
    return (int) Math.floor(Math.random()*fortunes.size());
  }
  
  @Override
  public String tellFortune() {
    // TODO Auto-generated method stub
    
    
    int randomFortuneIndex = generateRandomFortuneIndex();
    
    return fortunes.get(randomFortuneIndex);
  }

}
