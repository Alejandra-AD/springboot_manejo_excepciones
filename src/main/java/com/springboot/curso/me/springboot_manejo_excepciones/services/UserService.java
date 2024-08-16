package com.springboot.curso.me.springboot_manejo_excepciones.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.curso.me.springboot_manejo_excepciones.exceptions.UserNotFoundException;
import com.springboot.curso.me.springboot_manejo_excepciones.models.User;


@Service
public class UserService implements IUserService{

   private List<User> users;

   //Dependency injection
   private UserService(List<User> users) {

    this.users = users;

   }

    

    @Override
    public List<User> findAll() {
        return users;
      
    }

    @Override
    public Optional<User> findById(Long id) {
        
        return users.stream().filter(u->u.getId().equals(id)).findFirst();


    }

}
