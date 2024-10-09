package com.prakash.tel1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prakash {
    @RequestMapping("/")

    public String GREET() {

        return "Hello prakash";
    }

    @RequestMapping("/about")

    public String about() {
        return "i am learing Spring";
    }
}
