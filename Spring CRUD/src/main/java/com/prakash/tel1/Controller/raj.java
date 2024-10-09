package com.prakash.tel1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class raj {
    @RequestMapping("/login")

    public String login() {
        return "I can easily learn Soring";
    }
}
