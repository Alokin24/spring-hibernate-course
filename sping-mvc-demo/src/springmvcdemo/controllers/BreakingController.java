package springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/breaking")
@Controller
public class BreakingController {

  @RequestMapping("/showForm")
  public String displayTheForm() {
    return "breaking";
  }
}
