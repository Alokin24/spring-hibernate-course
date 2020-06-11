package com.jdbc.hibernate.demo.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Student;

public class PrimaryKeyDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // create session factory
    SessionFactory factory = 
        new Configuration()
        .configure("hibernate.student.cfg.xml")
        .addAnnotatedClass(Student.class)
        .buildSessionFactory();
    
    // get session from factory
    Session session = factory.getCurrentSession();
    
    try {
      // create 3 students
      Student student1 = new Student("Nikola", "Anast", "A123@gmail.com");
      Student student2 = new Student("Nikol", "Anast", "A123@gmail.com");
      Student student3 = new Student("Niko", "Anast", "A123@gmail.com");
      
      // open transaction
      session.beginTransaction();
      
      // save students
      session.save(student1);
      session.save(student2);
      session.save(student3);
      
      // commit transaction
      session.getTransaction().commit();
      
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    } finally {
      
      factory.close();
    }
    
  }

}
