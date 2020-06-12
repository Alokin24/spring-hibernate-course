package com.jdbc.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Instructor;
import com.jdbc.entity.InstructorDetail;

public class GetInstructorDetailDemo {
  
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
    
    // get InstructorDetail 
    int id = 3;

    InstructorDetail instructorDetailc = session.get(InstructorDetail.class, id);
    System.out.println(instructorDetailc);
    
    System.out.println(instructorDetailc.getInstructor());
    
    // commit transaction
    session.getTransaction().commit();
    
    // close factory
    factory.close();  
    
  }

}
