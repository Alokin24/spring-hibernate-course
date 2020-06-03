package com.springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.coaches.Coach;

public class BeanLifeCycleDemoApp {
  public static void main(String[] args) {
    
    // load config into context
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
    
    // load beans
    Coach coach = context.getBean("myCoach", Coach.class);
    
    // close context
    context.close();
  }
}
