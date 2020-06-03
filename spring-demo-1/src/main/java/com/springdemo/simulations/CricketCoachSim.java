package com.springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coaches.CricketCoach;

public class CricketCoachSim {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  
    // load config, context creates beans according to configuration
    ClassPathXmlApplicationContext applicationContext = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
  
    // load bean from context
//    Coach theCoach = applicationContext.getBean(CricketCoach.class, Coach.class);
    
    CricketCoach theCoach = applicationContext.getBean(CricketCoach.class, CricketCoach.class);
    
    
    // run methods    
    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.tellFortune());
    System.out.println(theCoach.getEmailAdress());
    System.out.println(theCoach.getTeam());
    
    // close context
    applicationContext.close();
  
  }
  

}
