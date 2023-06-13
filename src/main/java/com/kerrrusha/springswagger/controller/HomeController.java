package com.kerrrusha.springswagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Demo of Swagger at Spring Boot 2.1.18RELEASE, Product REST API");
        return "index";
    }

}
