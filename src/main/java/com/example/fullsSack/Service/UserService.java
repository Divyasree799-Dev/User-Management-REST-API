package com.example.fullsSack.Service;

import com.example.fullsSack.Model.User;

import java.util.List;

public interface UserService {
    public User save(User user);

   public List<User> getAll();

    public User getUserById(Long id);

    public String  deleteById(Long userId);

   public User updateUser(Long id, User user);
}
