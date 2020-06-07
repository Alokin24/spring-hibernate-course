package springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String viewPage() {
    
    // this is name of view template for model
    return "main-menu";
  }
}
