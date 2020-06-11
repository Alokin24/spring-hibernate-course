package com.jdbc.hibernate.demo;

import org.hibernate.cfg.Configuration;
import com.jdbc.entity.Student;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class QueryStudentDemo {

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
     
      // begin a transaction
      session.beginTransaction();
      
      // query students
      ArrayList<Student> studentsList = (ArrayList<Student>) session.createQuery("from Student").getResultList();
      
      displayStudents(studentsList);
      
      // commit the transaction
      session.getTransaction().commit();
      
      session = factory.getCurrentSession();
      session.beginTransaction();
      
      studentsList = (ArrayList<Student>) session.createQuery("from Student s where s.email like '%@gmail.com'").getResultList();
      displayStudents(studentsList);
      
      session.getTransaction().commit();
      
      // get session and begin transaction
      session = factory.getCurrentSession();
      session.beginTransaction();
      
      // query
      studentsList = (ArrayList<Student>) session.createQuery("from Student s where id > 4").getResultList();
      
      // print result from query
      displayStudents(studentsList);
      
      // commit transaction
      session.getTransaction().commit();
      
      // query #4
      session = factory.getCurrentSession();
      session.beginTransaction();
      
      studentsList = (ArrayList<Student>) session.createQuery
          ("from Student s where s.lastName='Duck'"
              + " OR s.firstName='Nikola'").getResultList();
      
      displayStudents(studentsList);
      
      session.getTransaction().commit();
      
    } finally {
      
      factory.close();
    }

  }

  private static void displayStudents(ArrayList<Student> studentsList) {
    for (Student student : studentsList) {
      System.out.println(student);
    }
  }

}
