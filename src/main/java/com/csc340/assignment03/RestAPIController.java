package com.csc340.assignment03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestAPIController {

    @GetMapping("/home")
    public String homepage() {
        return "index.html";
    }

    @GetMapping("/about")
    public String about() {
        return "about_me.html";
    }

    @GetMapping("/services")
    public String service() {
        return "services.html";
    }

}
