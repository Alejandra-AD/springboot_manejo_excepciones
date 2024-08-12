package com.springboot.curso.me.springboot_manejo_excepciones.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/app")

public class AppController {

    @GetMapping("/string")
    public String index(){
        // int div = 1000/0;
        // int value = Integer.parseInt("10x");
        return "ok 200";
    }

}
