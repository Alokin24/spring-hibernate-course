package springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvcdemo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

  @RequestMapping("/showForm")
  public String showForm(Model theModel) {
  
    // create a new Student object
    Student theStudent = new Student();
    
    // insert the Student object into the model as an attribute
    theModel.addAttribute("student", theStudent);
    
    return "student-form";
  }
  
  @RequestMapping("/processForm")
  public String processForm(@ModelAttribute("student") Student theStudent) {
    
    System.out.println(theStudent.getFirstName());
    
    return "student-confirmation";
  }
  
}
