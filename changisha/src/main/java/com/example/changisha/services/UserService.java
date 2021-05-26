package com.example.changisha.services;

import com.example.changisha.entities.User;
import com.example.changisha.exceptions.UserNotFoundException;
import com.example.changisha.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(int userid) throws UserNotFoundException {
        return userRepository.findById(userid).orElseThrow(()->new UserNotFoundException(userid));

    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User addUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(int userid,User userDetails) throws UserNotFoundException {
User user=userRepository.findById(userid).orElseThrow(()-> new UserNotFoundException(userid));
user.setAge(userDetails.getAge());
user.setFname(userDetails.getFname());
user.setGender(userDetails.getGender());
user.setLocation(userDetails.getLocation());
user.setPhoneNo(userDetails.getPhoneNo());
//user.setUserid(userDetails.getUserid());
User updatedUser=userRepository.save(user);
return updatedUser;
    }
    public  ResponseEntity<?> deleteUser(int userId) throws UserNotFoundException {
        User user= userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException(userId));
        userRepository.delete(user);
       return ResponseEntity.ok().build();
    }
}
