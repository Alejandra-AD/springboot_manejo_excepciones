package com.springboot.curso.me.springboot_manejo_excepciones.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.curso.me.springboot_manejo_excepciones.exceptions.UserNotFoundException;
import com.springboot.curso.me.springboot_manejo_excepciones.models.User;


@Service
public class UserService implements IUserService{

    private List <User> users;
    

    public UserService() {
        this.users = new ArrayList<User>();
        users.add(new User(1L,"Rocco","Pug"));
        users.add(new User(2L,"Gigi","TuxidoCat"));
        users.add(new User(3L,"Elsa","WhiteCat"));
        users.add(new User(4L,"Cappu","CoffeeCat"));
    
    }

    @Override
    public List<User> findAll() {
        return users;
      
    }

    @Override
    public User findById(Long id) {

        return users.stream().filter(u->u.getId().equals(id)).findFirst().orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));

    }

}
