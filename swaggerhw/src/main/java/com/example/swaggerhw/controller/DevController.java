package com.example.swaggerhw.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Profile("developer")
public class DevController {
    @PostMapping("/developer")
    public String testing() {
        return "Just testing";
    }
}
