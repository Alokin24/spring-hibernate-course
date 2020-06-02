package com.springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coaches.BasketballCoach;
import com.springdemo.coaches.Coach;

public class BBCoachSim {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // load configuration
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    // load bean
    Coach theCoach = applicationContext.getBean(BasketballCoach.class, Coach.class);
    
    // call bean method
    System.out.println(theCoach.getDailyWorkout());
    
    // close config
    applicationContext.close();
  }

}
