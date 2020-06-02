package com.springdemo.simulations;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coaches.Coach;
import com.springdemo.coaches.CricketCoach;

public class HelloSpringApp {

  public static void main(String[] args) {
    
    // load spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    // retrieve bean from spring container
   Coach theCoach = context.getBean(CricketCoach.class, Coach.class);
    
    // call method on the bean
   System.out.println(theCoach.getDailyWorkout());
   System.out.println(theCoach.tellFortune());
    // close the context
   context.close();

  }

}
