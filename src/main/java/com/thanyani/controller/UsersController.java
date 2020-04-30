package com.thanyani.controller;


import com.thanyani.service.UsersService;
import com.thanyani.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Users> viewAllUsers(){
        return usersService.getAllUsers();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Users getUserById(@PathVariable("id") UUID id){
        return usersService.getUserById(id);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
     public  void removeUsersById(@PathVariable("id") UUID id){
         usersService.removeUserById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public  void updateUsersById(Users users){
        usersService.upadateUserById(users );
    }
}
