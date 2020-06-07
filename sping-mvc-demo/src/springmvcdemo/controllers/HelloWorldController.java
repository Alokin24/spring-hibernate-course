package springmvcdemo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/hello")
@Controller
public class HelloWorldController {

  // mmethod za prikazhuvanje na forma
  @RequestMapping("/showForm")
  public String showForm() {
     return "helloworld-form";
  }

  // method za procesiranje na forma
  @RequestMapping("/processForm")
  public String processForm() {
    return "helloworld";
  }
  
  @RequestMapping("/processForm2nd")
  public String bigCase(HttpServletRequest request, Model model) {
    
    String nameString = request.getParameter("studentName");
    
    nameString = nameString.toUpperCase();
    
    nameString = "Yo, " + nameString;
    
    model.addAttribute("message", nameString);
    
    return "helloworld";
  }
  
  
  @RequestMapping("/processForm3rd")
  public String processFormVersionThree(
      @RequestParam("studentName") String theName, 
      Model model) {
    
    theName = theName.toUpperCase();
    
    String message = "Sup, " + theName;
    
    model.addAttribute("message", message);
    
    
    return "helloworld";
  }

}
