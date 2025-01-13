package com.kerteszzoltan.springSeriLibrary.controllers;


import com.kerteszzoltan.springSeriLibrary.models.User;
import com.kerteszzoltan.springSeriLibrary.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }


    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }
    @DeleteMapping(path = "{userId}")
    public void deleteSpecificUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }

    @PatchMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestBody User user){
        userService.updateUser(userId,user);
    }
}
