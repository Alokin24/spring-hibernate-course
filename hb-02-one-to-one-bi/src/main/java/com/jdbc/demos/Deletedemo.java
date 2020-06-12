package com.jdbc.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Instructor;
import com.jdbc.entity.InstructorDetail;

public class Deletedemo {
  
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
    
    int id = 2;

    Instructor instructor = session.get(Instructor.class, id);

    if (instructor != null) {
      session.delete(instructor);
    }
    
    // ne e kaskadno
//    session.createQuery("delete Instructor i where i.id=1").executeUpdate();
    
    // commit transaction
    session.getTransaction().commit();
    
    // close factory
    factory.close();  
    
  }

}
