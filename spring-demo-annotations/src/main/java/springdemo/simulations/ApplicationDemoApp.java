package springdemo.simulations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.coaches.Coach;



public class ApplicationDemoApp {

  public static void main(String[] args) {
    
    // read spring config
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
    
    // get the bean from spring container
    Coach myCoach = context.getBean("tennisCoach", Coach.class);
    
    // call bean methods
    System.out.println(myCoach.getDailyWorkout());
    
    // close the context
    context.close();
    
  }

}
