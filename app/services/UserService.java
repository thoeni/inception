package services;

import models.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);
    public List<User> getAllUsers();
    
}