package com.thanyani.dao;

import com.thanyani.users.Users;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class UsersDao {
    private static Map<Integer, Users> users;
    static {
        users = new HashMap<Integer, Users>(){
            {
                put(1, new Users(UUID.randomUUID(),"Thanyani","Tshikonwani"));
                put(2, new Users(UUID.randomUUID(),"Gogo","Mbongo"));
            }
        };
    }
    public Collection<Users> getUsers(){
        return this.users.values();
    }

    public Users getUserById(UUID id){
        return this.users.get(id);
    }

    public void removeUserById(UUID id){
         this.users.remove(id);
    }


    public void upadateUserById(Users user){
         Users usersUpdate =users.get(user.getId());
         usersUpdate.setName(user.getName());
         usersUpdate.setSurname(user.getSurname());
         users.put(Integer.valueOf(user.getId()),user);
    }


}
