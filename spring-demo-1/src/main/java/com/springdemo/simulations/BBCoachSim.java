package com.springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coaches.Coach;

public class BBCoachSim {

  public static void main(String[] args) {
    
    // load context from config
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
    
    // load bean
    Coach coach = context.getBean("bbCoach", Coach.class);
    Coach coach2 = context.getBean("bbCoach", Coach.class);
    
    //  test if the are the same bean
    System.out.println( (coach == coach2) );
    
    // test bean methods
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.tellFortune());
  }

}
