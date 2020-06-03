package com.springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coaches.Coach;

public class BeanScopeDemoApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // load config
    ClassPathXmlApplicationContext applicationContext = 
        new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
  
    // get beans
    Coach myCoach = applicationContext.getBean("myCoach", Coach.class);
    Coach alphaCoach = applicationContext.getBean("myCoach", Coach.class);
    
    // check if they are the same 
    boolean result = (myCoach == alphaCoach);
    System.out.println(result);
    
    // print memory locations
    System.out.println("Memory location of myCoach: " + myCoach);
    System.out.print("Memory location of alphaCoach: " + alphaCoach);
    
    // close context
    applicationContext.close();
  }

}
