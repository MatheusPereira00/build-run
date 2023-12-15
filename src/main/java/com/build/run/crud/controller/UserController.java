package com.build.run.crud.controller;


import com.build.run.crud.dtos.CreateUserDTO;
import com.build.run.crud.entity.User;
import com.build.run.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
//@RequestMapping("/v1/users")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

//    @PostMapping
//    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO createUserDTO){
//        var userId = userService.create(createUserDTO);
//        return  ResponseEntity.created(URI.create("/v1/users/" + userId.toString())).build();
//    }

    @PostMapping
    public List<User> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> list(){
        return userService.listUser();
    }
}
