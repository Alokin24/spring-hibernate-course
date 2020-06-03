package springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.coaches.Coach;

public class ScopeTestDemoApp {
  public static void main(String[] args) {
    
    // load context from config
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
    
    // get bean from context
    Coach coach1 = context.getBean("tennisCoach", Coach.class);
    Coach coach2 = context.getBean("tennisCoach", Coach.class);
    
    // test if they are the same bean
    // singleton or prototype
    System.out.println((coach1 == coach2));
    
    // close context
    context.close();
  }
}
