package com.example.fullsSack.Service;


import com.example.fullsSack.Exception.UserNotFoundException;
import com.example.fullsSack.Model.User;
import com.example.fullsSack.Repository.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{


    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserRepo userRepo;
    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    @Override
    public String deleteById(Long userId) {
        if(!userRepo.existsById(userId)){
            throw new UserNotFoundException(userId);
        }
        userRepo.deleteById(userId);
        return "User With "+userId+"deleted Successfully";
    }

    @Override
    public User updateUser(Long id, User user) {
        userRepo.findById(id).map(a->{
            a.setName(user.getName());
            a.setDepartment(user.getDepartment());
            a.setEmailId(user.getEmailId());
            a.setPhone(user.getPhone());
            return userRepo.save(a);
        }).orElseThrow(()->new UserNotFoundException(id));
        /*if(Objects.nonNull(user.getName())&&
                !user.getName().equalsIgnoreCase("")){
            userOld.setName(user.getName());

        }
        if(Objects.nonNull(user.getDepartment())&&
                !user.getDepartment().equalsIgnoreCase("")){
            userOld.setDepartment(user.getDepartment());

        }
        if(Objects.nonNull(user.getEmailId())&&
                !user.getEmailId().equalsIgnoreCase("")){
            userOld.setEmailId(user.getEmailId());

        }
        if(Objects.nonNull(user.getPhone())&&
                !user.getPhone().equalsIgnoreCase("")){
            userOld.setPhone(user.getPhone());

        }*/
        return user;
    }
}
