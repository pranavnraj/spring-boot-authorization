package com.authorization.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }

}
