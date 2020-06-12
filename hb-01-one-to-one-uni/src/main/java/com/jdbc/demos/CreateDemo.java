package com.jdbc.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Instructor;
import com.jdbc.entity.InstructorDetail;

public class CreateDemo {
  
  public static void main(String[] args) throws Exception {
    
    // create factory
    SessionFactory factory =
        new Configuration()
        .configure("hibernate.instructor.cfg.xml")
        .addAnnotatedClass(Instructor.class)
        .addAnnotatedClass(InstructorDetail.class)
        .buildSessionFactory();
        
    // get session from factory
    Session session = factory.getCurrentSession();
    
    // begin transaction
    session.beginTransaction();
    
//    // create Objects
//    Instructor instructor = new Instructor("Nikola", "Anasta", "123@gmail.com");
//    
//    InstructorDetail instructorDetail = new InstructorDetail("123@youtube.com", "basketball");
//    
//    // associate Objects
//    instructor.setInstructorDetail(instructorDetail);
    
    Instructor instructor = new Instructor("ikola", "Anast", "nanasta@gmail.com");
    
    InstructorDetail instructorDetail = new InstructorDetail("qw@youtube.com", "basket");
    
    // associate Objects
    instructor.setInstructorDetail(instructorDetail);
    
    // save them
    session.save(instructor);
    
    // commit transaction
    session.getTransaction().commit();
    
    // close factory
    factory.close();  
    
  }

}
