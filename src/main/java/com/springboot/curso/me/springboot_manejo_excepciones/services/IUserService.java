package com.springboot.curso.me.springboot_manejo_excepciones.services;

import java.util.List;
import java.util.Optional;

import com.springboot.curso.me.springboot_manejo_excepciones.models.User;

public interface IUserService {

    public List <User> findAll();

    public User findById(Long id);
    
    

}
