package com.jdbc.hibernate.demo.student;

import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class CreateStudentDemo {

  public static void main(String[] args) {
    
    // create session factory
    SessionFactory factory = 
        new Configuration()
        .configure("hibernate.student.cfg.xml")
        .addAnnotatedClass(Student.class)
        .buildSessionFactory();
    
    // create a session
    Session session = factory.getCurrentSession();
    
    try {
      
      // create a student object
      Student student = new Student("Dunkin", "Donald", "A123@gmail.com");
      
      System.out.println(student);
      
      // begin a transaction
      session.beginTransaction();
      
      // save the object
      session.save(student);
      
      // commit the transaction
      session.getTransaction().commit();
      
    } finally {
      
      factory.close();
    }

  }

}
