package com.example.demo.services;

import com.example.demo.modal.User;

public interface UserService {
    public User findByUserName(String userName);
}
