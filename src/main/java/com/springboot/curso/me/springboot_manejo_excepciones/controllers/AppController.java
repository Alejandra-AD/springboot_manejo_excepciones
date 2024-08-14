package com.springboot.curso.me.springboot_manejo_excepciones.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.curso.me.springboot_manejo_excepciones.exceptions.UserNotFoundException;
import com.springboot.curso.me.springboot_manejo_excepciones.models.User;
import com.springboot.curso.me.springboot_manejo_excepciones.services.UserService;

@RestController
//@RequestMapping("/app")

public class AppController {

    // @Autowired
    UserService service;

    @Autowired
    AppController(UserService service) {
        this.service = service;
    }


    @GetMapping("/string")
    public String index(){
        // int div = 1000/0;
        // int value = Integer.parseInt("10x");
        return "ok 200";
    }


    @GetMapping("/show/{id}")
    public User showUser(@PathVariable Long id){
        User user = service.findById(id);
        System.out.println(user.getName());
        return user;

    }


}
