package com.jdbc.hibernate.demo.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Employee;

public class CreateEmployeeDemo {

  public static void main(String[] args) throws Exception {
    
    // create factory
    SessionFactory factory = 
        new Configuration()
        .configure("hibernate.employee.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory();
    
    // get session from factory
    Session session = factory.getCurrentSession();
    
    // begin transaction on session
    session.beginTransaction();
    
    // create employee
    Employee employee = new Employee("Fikola", "Fnastasovski", "cet");
    
    // add employee to session(table)
    session.save(employee);
    
    employee = new Employee("Paff", "Puck", "cet");
    
    // add employee to session(table)
    session.save(employee);

    employee = new Employee("ikola", "Anastasovski", "cet");
    
    // add employee to session(table)
    session.save(employee);
    
    // commit transaction
    session.getTransaction().commit();
    
    // close factory
    factory.close();
    
  }

}
