package com.jdbc.hibernate.demo.employee;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Employee;

public class ReadEmployeeDemo {
 
  public static void main(String[] args) {
    
    SessionFactory factory = 
        new Configuration()
        .configure("hibernate.employee.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory();
    
    Session session = factory.getCurrentSession();
    session.beginTransaction();
    
    int id = 4;
    
    Employee refEmployee = session.get(Employee.class, id);
    System.out.println(refEmployee);
    
    session.getTransaction().commit();
    
    session = factory.getCurrentSession();
    session.beginTransaction();
    
    ArrayList<Employee> employees = (ArrayList<Employee>) session.createQuery("from Employee s where s.company='cet'").getResultList();
    
    for (Employee employee : employees) {
       System.out.println(employee);
    }
    
    session.getTransaction().commit();
    
    factory.close();
  }

}
