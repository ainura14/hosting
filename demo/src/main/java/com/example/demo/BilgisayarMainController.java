package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarMainController {
    @GetMapping("/main")
    public String mainPageG() {
        return "index";
    }

    @PostMapping("/main")
    public String mainSite() {
        return "index";
    }
}