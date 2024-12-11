package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/about")
    public String about() {
        return "about"; // Render about.html
    }

    @GetMapping("/services")
    public String services() {
        return "services"; // Render services.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Render contact.html
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup"; // Render signup.html
    }
}
