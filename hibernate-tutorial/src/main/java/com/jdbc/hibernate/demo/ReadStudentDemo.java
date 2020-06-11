package com.jdbc.hibernate.demo;

import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class ReadStudentDemo {

  public static void main(String[] args) {
    
    // create session factory
    SessionFactory factory = 
        new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class)
        .buildSessionFactory();
    
    // create a session
    Session session = factory.getCurrentSession();
    
    try {
      
      // create a student object
      Student student = new Student("Daff", "Duck", "A123@gmail.com");
      
      System.out.println(student);
      
      // begin a transaction
      session.beginTransaction();
      
      // save the object
      session.save(student);
      
      // commit the transaction
      session.getTransaction().commit();
      
      // start a new session
      session = factory.getCurrentSession();
      session.beginTransaction();
      
      // get the Student
      Student redStudent = session.get(Student.class, student.getId());
      
      System.out.println(redStudent);
      
      session.getTransaction().commit();
      
    } finally {
      
      factory.close();
    }

  }

}
