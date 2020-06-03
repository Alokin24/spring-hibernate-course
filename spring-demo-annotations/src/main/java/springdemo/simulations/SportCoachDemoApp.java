package springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.coaches.SportCoach;

public class SportCoachDemoApp {
  public static void main(String[] args) {
    
    // create context from config
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
    
    // get a bean from context
    SportCoach sportCoach = context.getBean("sportCoach", SportCoach.class);
    
    // call bean methods
    System.out.println(sportCoach.tellMeEverything());
    
    // close context
    context.close();
  }
}
