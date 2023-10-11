package com.example.travelmanagement.service;

import com.example.travelmanagement.entity.User;

public interface UserService {

    User createUser(User user);

    User getUserByUserName(String  name);

   // User getUserByUsername(String username);

    //boolean isUsernameTaken(String username);

    User updateUser(String  name,User updatedUser);

    void deleteUser(Long id);

    //List getAllUsers();

    //void changePassword(Long userId, String newPassword);

    //void addRolesToUser(Long userId, List roles);

    //void removeRolesFromUser(Long userId, List roles);

}

