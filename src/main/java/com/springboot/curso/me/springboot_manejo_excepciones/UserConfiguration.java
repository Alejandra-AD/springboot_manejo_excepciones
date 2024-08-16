package com.springboot.curso.me.springboot_manejo_excepciones;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.curso.me.springboot_manejo_excepciones.models.User;

@Configuration
public class UserConfiguration {

    @Bean
    List<User> users(){
        return Arrays.asList(
            (new User(1L,"Rocco","Pug")),
            (new User(2L,"Gigi","TuxidoCat")),
            (new User(3L,"Elsa","WhiteCat")),
            (new User(4L,"Cappu","CoffeeCat")));
        
    }






}
