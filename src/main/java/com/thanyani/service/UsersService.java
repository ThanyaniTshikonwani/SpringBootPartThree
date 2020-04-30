package com.thanyani.service;

import com.thanyani.dao.UsersDao;
import com.thanyani.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    public Collection<Users> getAllUsers() {
        return this.usersDao.getUsers();
    }

    public Users getUserById(UUID id){
        return this.usersDao.getUserById(id);
    }

    public void removeUserById(UUID id){
         this.usersDao.removeUserById(id);
    }

    public void upadateUserById(Users user){
       this.usersDao.upadateUserById(user);
    }
}
