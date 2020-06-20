package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
  @GetMapping("/")
  public String init(Model model) {
    model.addAttribute("model", new DemoModel(null, "Initial title"));
    return "demo";
  }
}
