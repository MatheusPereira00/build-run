package com.build.run.crud.service;

import com.build.run.crud.dtos.CreateUserDTO;
import com.build.run.crud.entity.User;
import com.build.run.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> createUser(User user){
        userRepository.save(user);
        return listUser();
    }
    public List<User> listUser(){
        return userRepository.findAll();
    }

//    public UUID create(CreateUserDTO createUserDTO){
//        DTO - ENTITY
//         var entity = new User(
//                 UUID.randomUUID(),
//                 createUserDTO.username(),
//                 createUserDTO.email(),
//                 createUserDTO.password(),
//                 Instant.now(),
//                 null);
//
//         var userSaved = userRepository.save(entity);
//
//         return userSaved.getUserId();
//    }
}
