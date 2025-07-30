package com.example.fullsSack.Controller;


import com.example.fullsSack.Exception.UserNotFoundException;
import com.example.fullsSack.Model.User;
import com.example.fullsSack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.*;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/user")
     public User newUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("getAll")
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @GetMapping("/get/{userId}")
    public User getUserById(@PathVariable("userId") Long id){
        return userService.getUserById(id);

    }
    @DeleteMapping("/del/{id}")
    public String deleteById(@PathVariable("id") Long userId){
       return userService.deleteById(userId);
    }
    @PutMapping("/update/{userId}")
    public User updateUserById(@PathVariable("userId") Long id,@RequestBody User user){
        return userService.updateUser(id,user);
    }

}
