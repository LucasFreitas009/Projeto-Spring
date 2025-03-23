package com.java.SpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/Saudacao")
    public String saudar() {
        return "Olá! Essa é minha primeira aplicação utilizando o Spring Boot";
    }
}
